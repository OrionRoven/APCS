// Standard Duo Configuration| Nakib Abedin, Orion Roven, Max Schneider
// APCS pd07
// HW68 -- recursively probing for a closed cycle
// 2022-03-02w
// time spent: 2.0 hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO:
 * Step 1: Place a knight in the most upperleft square.
 * Step 2: Place another knight an “L” away according to the order. If impossible, place in next location of order
 * Step 3: If the end of order is reached with no plays, go back one step and go down the order by one.
 * Step 4: If you go all the way back to the beginning, place the first knight in the next square to the right until you reach the end of the board.
 *
 * DISCO:
 * 1) Backtracking has an extremely slow runtime. Even n=6 takes a while to run completely.
 * 2) There is a difference between Depth-spaced recursion and Breadth-spaced recursion. Depth-spaced tries one of them at a time all the way to the end whereas breadth-spaced tries them all at a time.
 *
 *
 * QCC:
 * 1) Can you complete a knight's tour for all n x n sized board where n > 4?
 *
 *
 *
 * Mean execution times for boards of size n*n:
 * n=5   1.714s    across 1 execution
 * n=6   26.049s   across 1 execution
 * n=7   223m2.021s    across 1 execution
 * n=8   789s    across 1 execution
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //int startY = //YOUR MATH CONSTRUCT FOR GENERATING A RANDOM LEGAL X VALUE
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n ;

    //init 2D array to represent square board with moat
    _board = new int[_sideLength + 4][_sideLength + 4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int i = 0; i < _sideLength + 4; i ++) {
      for (int e = 0; e < _sideLength + 4; e ++) {
        if (i < 2 || e < 2 || i > _sideLength + 1|| e > _sideLength + 1) {
          _board[i][e] = -1;
        }
      }
    }
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/

  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved == true ) System.exit(0);

    //primary base case: tour completed
    if ( moves > (_sideLength )* (_sideLength ) ) {
      _solved = true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y] != 0 ) {
      return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] = moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ???
        ******************************************/
        findTour(x +1, y+2, moves + 1);
        findTour(x +2, y+1, moves + 1);
        findTour(x +2, y-1, moves + 1);
        findTour(x +1, y-2, moves + 1);
        findTour(x -1, y-2, moves + 1);
        findTour(x -2, y-1, moves + 1);
        findTour(x -2, y+1, moves + 1);
        findTour(x -1, y+2, moves + 1);
      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
        _board[x][y]=0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()


}//end class TourFinder

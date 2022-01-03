// Team Incredibly Cohesive (Orion Roven, Jaylen Zeng, David Chen)
// APCS pd7
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent: .7hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 1)Starting at the right, compare elements adjacent to one another and swap them if necessary for sortedness
 2)Continue this process until you reach the leftmost element
 3)Because the necessary number of passes to ensure sortedness is n-1 where n is the number of elements in the original array, repeat this process n-1 times
 *
 * DISCO:
 class ArrayList has a data.set(x,y) method that sets data at index x equal to y
 we can not create 2 ArrayLists with the same name or the computer gets mad at us
 in order to swap elements of a list it is necessary to create a temporary element so that we don't set the swapped elements to the same value
 *
 * QCC:
 * q0: If a pass requires no swaps, what do you know?
 * a0: That the list is sorted
 * q1: After pass p, what do you know?
 * a1: We know that the first p elements are sorted and in the right place
 * q2: How many passes are necessary to completely sort?
 * a2: The length of the array - 1 for the worst case (elements were in descending order)
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    //loop thru the array data.size()-1 times to ensure sortedness
    for (int x = 0; x < data.size()-1; x++) {
      //y must be greater than x because after x passes, we know that the first x elements are in the right place
      for (int y = data.size()-1; y > x; y--) {
        if (data.get(y-1).compareTo(data.get(y)) == 1) {
          Comparable stillDavid = data.get(y);
          data.set(y, data.get(y-1));
          data.set(y-1, stillDavid);
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> Orion = input;
    //loop thru the array data.size()-1 times to ensure sortedness
    for (int x = 0; x < input.size()-1; x++) {
      //y must be greater than x because after x passes, we know that the first x elements are in the right place
      for (int y = input.size()-1; y > x; y--) {
        if (input.get(y-1).compareTo(input.get(y)) == 1) {
          Comparable Jaylen = input.get(y);
          Orion.set(y, input.get(y-1));
          Orion.set(y-1, Jaylen);
        }
      }
    }
    return Orion;
  }

  public static void main( String [] args )
  {
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      /*===============for VOID methods=============
      ============================================*/

      ArrayList jeff = new ArrayList<Integer>();
      jeff.add(7);
      jeff.add(1);
      jeff.add(5);
      jeff.add(12);
      jeff.add(3);
      System.out.println( "ArrayList jeff before sorting:\n" + jeff );
      ArrayList jeffSorted = bubbleSort( jeff );
      System.out.println( "sorted version of ArrayList jeff:\n" + jeffSorted );
      System.out.println( "ArrayList jeff after sorting:\n" + jeff );
      ArrayList bob = populate( 10, 1, 1000 );
      System.out.println( "ArrayList bob before sorting:\n" + bob );
      ArrayList bobSorted = bubbleSort( bob );
      System.out.println( "sorted version of ArrayList bob:\n" + bobSorted );
      System.out.println( "ArrayList bob after sorting:\n" + bob );
      /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort

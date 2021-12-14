/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW43 -- Array of Grade 316
12/7/21
time elapsed: 0.8 hours
DISCO:
our program requires a ton of memory because we have to create new temporary arrays and loop through them so the visualizer isn't helpful because it exceeds the time limit
QCC:
is there a simpler way to code toString() so that we don't have to loop through the array and exceed the visualizer time
*/
public class SuperArray {

    private int[] _data; // underlying container
    private int _size; // number of elements in this SuperArray

    // default constructor – initializes 10-item array
    public SuperArray() {
        /* YOUR IMPLEMENTATION HERE */
        this._data = new int[10];
        this._size = this._data.length;
    }

    // output SuperArray in [a,b,c] format
    public String toString() {
        String result = "[";
        for (int i = 0; i < _data.length; i++) {
            result += _data[i];
            if (i != _data.length - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }

    // double capacity of SuperArray
    private void expand() {
        /* YOUR IMPLEMENTATION HERE */
        int[] temp = new int[_data.length * 2];
        for (int i = 0; i < _data.length; i++) {
            temp[i] = _data[i];
        }
        this._data = temp;
        this._size *= 2;
    }

    // accessor -- return value at specified index
    public int get(int index) {
        /* YOUR IMPLEMENTATION HERE */
        return this._data[index];
    }

    // mutator -- set value at index to newVal,
    // return old value at index
    public int set(int index, int newVal) {
        /* YOUR IMPLEMENTATION HERE */
        int oldVal = this._data[index];
        this._data[index] = newVal;
        return oldVal;
    }

    public void add(int num) {
        int[] temp = new int[this._size+1];
        for (int i = 0; i < this._size; i++) {
            temp[i] = _data[i];
        }
        temp[this._size]=num;
        _data=temp;
        _size++;
    }

    public void add(int index, int num) {
        int[] temp = new int[this._size+1];
        for (int i = 0; i < index; i++) {
          temp[i]=_data[i];
        }
        temp[index]=num;
        for (int i = index+1; i < this._size; i++) {
          temp[i+1]=_data[i];
        }
        _data=temp;
        _size++;
    }

    public void remove(int index) {
        int[] temp = new int[this._size-1];
        for (int i=0; i<_size-1; i++) {
            if (i == index) {
              i = (_size-1);
            }
            else {
              temp[i]=_data[i];
            }
        }
        for (int i = index; i < this._size-1; i++) {
          temp[i] = _data[i+1];
        }
        _data=temp;
        _size--;
    }

    // main method for testing
    public static void main(String[] args) {
      
        SuperArray fred = new SuperArray();
        System.out.println("Printing empty SuperArray fred...");
        System.out.println(fred);
        for (int i = 0; i < fred._data.length; i++) {
            fred.set(i, i * 2);
        }
        System.out.println("Printing populated SuperArray fred...");
        System.out.println(fred);
        for (int i = 0; i < 3; i++) {
            fred.expand();
            System.out.println("Printing expanded SuperArray fred...");
            System.out.println(fred);
        }
        SuperArray ra = new SuperArray();
        System.out.println("Initial ra: "+ra);
        ra.add(5);
<<<<<<< HEAD
        System.out.println("Ra after adding 5: "+ra);
        ra.addAtIndex(2, 7);
        System.out.println("AddAtIndex(2, 7) ra: "+ra);
=======
        System.out.println("Ra after adding 5: ");
        System.out.println(ra);
        ra.add(2, 7);
        System.out.println("AddAtIndex ra: ");
        System.out.println(ra);
        System.out.println("Removing at item...");
        ra.remove(2);
        System.out.println(ra);
    
        SuperArray curtis = new SuperArray();
        System.out.println( "Printing empty SuperArray curtis..." );
        System.out.println( curtis );
        for( int i = 0; i < curtis._data.length; i++ ) {
        curtis.set( i, i * 2 );
        }
        System.out.println("Printing populated SuperArray curtis...");
        System.out.println(curtis);
        for( int i = 0; i < 3; i++ ) {
        curtis.expand();
        System.out.println("Printing expanded SuperArray curtis...");
        System.out.println(curtis);
        System.out.println("new length of underlying array: "
        + curtis._data.length );
        }
        SuperArray mayfield = new SuperArray();
        System.out.println("Printing empty SuperArray mayfield...");
        System.out.println(mayfield);
        mayfield.add(5);
        mayfield.add(4);
        mayfield.add(3);
        mayfield.add(2);
        mayfield.add(1);
        System.out.println("Printing populated SuperArray mayfield...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.remove(3);
        System.out.println("Printing SuperArray mayfield post-remove...");
        System.out.println(mayfield);
        mayfield.add(3,99);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(2,88);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
        mayfield.add(1,77);
        System.out.println("Printing SuperArray mayfield post-insert...");
        System.out.println(mayfield);
>>>>>>> 7c231b5c7cf637a772463342bec5ea46b698a32a
    }// end main()
}// end class
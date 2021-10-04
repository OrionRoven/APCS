/*
Orion Roven
APCS
HW10 refactor BigSib
10/4/21

Discoveries:
If you execute a print function on another print function then you get an error
If we replace void with String in BigSib.java then it works, because we want BigSib to return a String, not nothing

Unresolved questions:
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Orion") );
        System.out.println( BigSib.greet("Paul") );
        System.out.println( BigSib.greet("Max") );
    }
}

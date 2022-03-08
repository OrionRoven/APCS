/*
Standard Duo Configuration| Orion Roven + Max Schneider + Nakib Abedin
APCS pd07
HW71-unmask
2022-03-07
Time Spent: 1.0 hr

DISCO:
1) There was a skeleton that we didn't realize was there until after we finsihed the homework and went above the allocated time. We chose to just keep the file that we implemented instead of going back to the skeleton.
2) O(n) is the runtime for the algorithm because we only need to go through the array once.
QCC:
1) What does the algorithm do?
2) What use does the algorithm provide?
*/

public class Mysterion{

  public static void swap(int[] input, int x, int y){
    int tempX = input[x];
    input[x] = input[y];
    input[y] = tempX;
  }

  public static String toString(int[] a){
    String output = "{";
    for (int i = 0; i < a.length; i++) {
      output = output + " " + a[i] + ",";
    }
    output += "}";
    return output;
  }

  public static int[] mysterion(int[] orion, int a, int b, int c) {
    int v = orion[c];
    swap(orion,c,b);
    int s=a;
    for(int i = a; i < b; i++){
      if(orion[i]<v){
        swap(orion,s,i);
        s++;
      }
    }
    swap(orion,b,s);
    return orion;
  }

  public static void main(String[] args) {
    int[] arr1 = {7, 1, 5, 12, 3};
    System.out.println(toString(mysterion(arr1, 0, 4, 2)));

    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(toString(mysterion(arr2, 0, 4, 2)));

    int[] arr3 = {7, 5, 1, 12, 3};
    System.out.println(toString(mysterion(arr3, 0, 4, 2)));

    int[] arr4 = {7, 5, 1, 3, 12};
    System.out.println(toString(mysterion(arr4, 0, 4, 2)));
  }
}

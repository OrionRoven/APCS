public class Mysterion{

  public static void swap(int x, int y){
    int tempX = arr[x];
    arr[x] = arr[y];
    arr[y] = tempX;
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
    swap(c,b);
    int s=a;
    for(int i = a; i < b; i++){
      if(orion[i]<v){
        swap(s,i);
        s++;
      }
    }
    swap(b,s);
    return orion;
  }

  public static void main(String[] args) {
    int[] arr = {7, 1, 5, 12, 3};
    System.out.println(toString(mysterion(arr, 0, 4, 2)));

    // int[] arr = {7, 1, 5, 12, 3};
    // System.out.println(toString(mysterion(arr));
    //
    // int[] arr = {7, 1, 5, 12, 3};
    // System.out.println(toString(mysterion(arr));
    //
    // int[] arr = {7, 1, 5, 12, 3};
    // System.out.println(toString(mysterion(arr));
  }
}

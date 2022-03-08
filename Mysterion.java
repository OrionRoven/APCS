public class Mysterion{

  private static int[] arr = {7, 1, 5, 12, 3};
  private static int a = 0;
  private static int b=4;
  private static int c=2;


  public static void swap(int x, int y){
    int tempX = arr[x];
    arr[x] = arr[y];
    arr[y] = tempX;
  }

  public static void main(String[] args) {
    int v = arr[c];
    swap(c,b);
    int s=a;
    for(int i = a; i < b; i++){
      if(arr[i]<v){
        swap(s,i);
        s++;
      }
    }
    swap(b,s);

    System.out.println(arr);
  }
}

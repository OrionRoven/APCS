import java.util.LinkedList;

public class MRKPirateBae {
  public static void main(String[] args) {
    LinkedList<String> jackSparrow = new LinkedList<String>();

    System.out.println(jackSparrow.isEmpty()); //true

    jackSparrow.addFirst("swashbuckler");
    System.out.println(jackSparrow);

    jackSparrow.addFirst("captain");
    System.out.println(jackSparrow);

    jackSparrow.addLast("sparrow");
    System.out.println(jackSparrow);

    System.out.println(jackSparrow.size()); //3

    jackSparrow.removeFirst();
    System.out.println(jackSparrow);

    jackSparrow.removeLast();
    System.out.println(jackSparrow);

    System.out.println(jackSparrow.isEmpty()); //false
    jackSparrow.removeLast();
    System.out.println(jackSparrow.isEmpty()); //true
  }
}

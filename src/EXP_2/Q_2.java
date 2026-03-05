package EXP_2;
import java.util.LinkedList;
public class Q_2 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addFirst(2);
		ll.addLast(10);
		ll.addFirst(1);
		ll.addLast(11);
		System.out.println("Contents of Linked List: " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of Linked List: " + ll);
	}
}
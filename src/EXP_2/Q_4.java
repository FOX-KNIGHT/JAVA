package EXP_2;
import java.util.*;
public class Q_4 {

	public static void main(String[] args) {
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.add(7);
		a.add(18);
		a.add(27);
		System.out.println("Queue:"+a);
		System.out.println("Queue size:"+a.size());
		System.out.println("Queue top:"+a.peek());
		System.out.println("Queue remove:"+a.remove());
		System.out.println("Queue isEmpty:"+a.isEmpty());
	}

}

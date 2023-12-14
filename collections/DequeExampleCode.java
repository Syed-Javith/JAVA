import java.util.*;
public class DequeExampleCode{
	public static void main(String[] args){
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.addFirst(2);
		dq.add(1);
		dq.addLast(6);
		dq.addFirst(3);
		dq.add(4);
		System.out.println(dq);
		dq.removeFirst();
		System.out.println("after removeFirst() " + dq);
		dq.removeLast();
		System.out.println("after removeLast() " + dq);
		System.out.println("First Element is " + dq.getFirst() + " Last Element is " + dq.getLast());
	}
}
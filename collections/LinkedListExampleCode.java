import java.util.*;

public class LinkedListExampleCode{
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(3);
		ll.add(5);
		ll.add(6);
		System.out.println(ll);
		ll.remove(1);
		System.out.println("after remove "+ ll);
		ll.add(1,4);
		System.out.println("after adding "+ ll);
		System.out.println("index of 4 " + ll.indexOf(4));
		System.out.println("index of 9 " + ll.indexOf(9));
		ll.remove(ll.indexOf(5));
		System.out.println("after removing 5 using its index "+ ll);
	}
}
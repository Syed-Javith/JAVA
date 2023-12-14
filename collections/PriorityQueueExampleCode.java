import java.util.*;
public class PriorityQueueExampleCode{
	public static void main(String[] args){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10);
	//	PriorityQueue
		pq.add(3);
		pq.add(2);
		System.out.println(pq);
		pq.add(5);
		System.out.println(pq);
		pq.add(4);
		System.out.println(pq);
		pq.remove();
		System.out.println("removing using remove() " + pq);
		pq.remove(1);
		System.out.println("removing using remove(1) " + pq);
	}
}
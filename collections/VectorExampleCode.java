import java.util.*;

public class VectorExampleCode{
	public static void main(String[] args){
		Vector<Integer> vtr = new Vector<Integer>();
		vtr.add(10);
		vtr.add(3);
		vtr.add(7);
		System.out.println(vtr);
		vtr.add(2,5);
		System.out.println("Vector after adding element using vtr.add(2,5) " + vtr );
		vtr.remove(1);
		System.out.println("Vector after removing element using vtr.remove(1) " + vtr );
		System.out.println("is 5 prsent if present the index is : " + vtr.indexOf(5));
		System.out.println("the size is " + vtr.size());
		System.out.println("element at index 2 using get(2) : " + vtr.get(2));
	}
}
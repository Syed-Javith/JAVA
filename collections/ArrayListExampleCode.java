import java.util.*;
class ArrayListExampleCode{
	public static void main(String[] args){
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(2);
		arl.add(10);
		arl.add(11);
		arl.add(1);
		arl.add(4);
		arl.add(3);
		System.out.println(arl);
		for(int ele : arl )
 		System.out.print(ele + " " );
		arl.remove(1);
		System.out.println("after removing element using remove() " + arl);
		arl.add(2,6);
		System.out.println("after adding element using add(2,6) " + arl);
		arl.remove(1);
		System.out.println("after removing element using remove(1) " + arl);
		System.out.println("is the element 6 present in list " + arl.contains(6));
		if( arl.contains(6))
		System.out.println("if contains it is present in the index " + arl.indexOf(6));
		arl.set(1,11);
		System.out.println("after updating elements using set(1,11) " + arl);
 	}
}


//first priority is given to index 

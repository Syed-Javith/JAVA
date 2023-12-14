import java.util.*;
class StackExapleCode{
	public static void main(String[] args){
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(1);
		stk.push(2);
		stk.push(10);
		stk.push(8);
		stk.push(7);
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		System.out.println("element using peek() " + stk.peek());
		System.out.println("is element 10 present using search if present is at index : " + stk.search(10));
		while(!stk.isEmpty())
		System.out.print(stk.pop() + " " );
		System.out.println();	

	}
}
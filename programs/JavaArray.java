import java.util.*;
public class Binary{
 static Stack<Integer> toBinary(int n){
	int temp = n,top=0;
	Stack<Integer> stk = new Stack<Integer>();
	while(temp>0){
		stk.push(temp%2);
		temp = temp/2;
	}
	return stk;
}
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Stack<Integer> binary = toBinary(n);
	System.out.println(stk);
}
}
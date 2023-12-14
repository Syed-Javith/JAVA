import java.util.*;
class A{
	int x ;
	A(int x){
		this.x = x ;
	}
}
public class WithoutMain{
	static{
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt() ;
		System.out.println(a);
		A obj = new A(a);
		System.out.println(obj.x);
		for(int i = 0 ; i < a ; i++)
		 System.out.print(i+1 + " " );
		System.exit(0);
	}

}
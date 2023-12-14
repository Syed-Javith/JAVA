import java.util.*;

public class SetExampleCode{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		for(int i = 0 ; i < 10 ; i++){
			int num = sc.nextInt();
			set.add(num);
		}
		System.out.println(set);
		set.remove(3);
		System.out.println("In set the remove removes the element rather than index");
		System.out.println(set.get());
	}
}
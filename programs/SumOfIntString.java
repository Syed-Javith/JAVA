import java.util.*;
public class SumOfIntString{
	public static int SumInString(String str){
		int sum = 0 ;
		for(int i = 0 ; i < str.length() ; i++ ){
			if(!(str.charAt(i) >='A' && str.charAt(i) <= 'Z' ))
				sum += (str.charAt(i) - '0');
		}
		return sum ;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(SumInString(str));
	}
}
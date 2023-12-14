import java.util.*;
public class CharArray{
	public static char[] Left(char[] arr , int n ){
	char temp = arr[0];
	for(int i=0;i<n-1;i++){
	  arr[i] = arr[i+1];
	}
	arr[n-1] = temp;
	return arr;
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch_arr = str.toCharArray();
		ch_arr = Left(ch_arr,str.length());
		 for(char ch : ch_arr)
			System.out.println(ch); 
	}
}
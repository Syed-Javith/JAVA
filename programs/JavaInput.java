import java.util.*;
public class JavaInput{
    public static void main(String[] args)
 {
    Scanner sys = new Scanner(System.in);
    int n = sys.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n ; i++){
        a[i] = sys.nextInt();
        System.out.println(a[i]);
    }
    //System.out.println(a);
 }
}
interface A{
    int a=9;
}
interface B{
    int b=10;
}
class C implements A,B{
    public int c;
    C(int c){
        this.c = c;
    }
    public void getValueFromC(){
        System.out.println("A = " + this.a + " B = " + this.b + " C = " + this.c);
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        C obj = new C(2);
        obj.getValueFromC();
    }
}
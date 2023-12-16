class A {
    public int a;
    
    A(int a){
        this.a = a;
    }
}
class B extends A{
    public int b;
    B(int a , int b){
        super(a);
        this.b = b;
    }
    public void getValueFromB(){
        System.out.println("A = " + this.a + " B = " + this.b);
    }
}
class C extends A{
    public int c;
    C(int a,int c){
        super(a);
        this.c = c;
    }
    public void getValueFromC(){
        System.out.println("A = " + this.a + " C = " + this.c);
    }
}
public class HeirachicalInheritance{
    public static void main(String[] args){
        C obj = new C(1,2);
        obj.getValueFromC();
        B obj1 = new B(2,5);
        obj1.getValueFromB();
    }
}
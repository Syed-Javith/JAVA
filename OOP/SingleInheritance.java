class A {
    public int a;
    
    A(int a){
        this.a = a;
    }
}
class B extends A{
    public int b;
    B(int b , int a ){
        super(a);
        this.b = b;
    }
    public void getValues(){
        System.out.println(this.a + " " + this.b);
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        B obj2 = new B(6,4);
        obj2.getValues();
    }
}
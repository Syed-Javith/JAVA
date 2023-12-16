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
class C extends B{
    public int c;
    C(int a,int b ,int c){
        super(a,b);
        this.c = c;
    }
    public void getAllValues(){
        System.out.println(this.a + " " + this.b + " " + this.c);
    }
}
public class MultiLevelInheritance{
    public static void main(String[] args){
        C obj = new C(1,2,3);
        obj.getAllValues();
        obj.getValues();
    }
}
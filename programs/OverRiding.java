class A{
    void meaasge(){
        System.out.println("meaasge from A");
    }
}
class B extends A{
    void message(){
        System.out.println("message from B");
    }
}
public class OverRiding{
    public static void main(String[] args){
       B b = new B();
       b.message();
    }
}
package Nov.ex_11112024_SuperKeyword_Abstraction;

public class Lab161_Interface_P2 {
    public static void main(String[] args) {
        P p=new P();
        p.f1();
       //  I1 ff=new I1(); object cannot be created for any incomplete class or interface
    }
}
class P implements I1{

    @Override
    public void f1() {
        System.out.println("f1");
    }

    @Override
    public void f2() {
        System.out.println("f2");
    }

    @Override
    public void f3() {
        System.out.println("f3");
    }
}
interface I1{
    void f1();
    void f2();
    void f3();
}
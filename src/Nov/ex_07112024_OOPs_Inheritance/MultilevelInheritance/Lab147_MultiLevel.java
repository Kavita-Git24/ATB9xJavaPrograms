package Nov.ex_07112024_OOPs_Inheritance.MultilevelInheritance;

public class Lab147_MultiLevel {
    public static void main(String[] args) {
        Child c =new Child();
        c.home();
        c.gf();
        c.f();
        c.c();
        System.out.println("-----------------------");
        Father f1=new Father();
        f1.gf();
        f1.f();
        f1.extra();
        System.out.println("-----------------------");
        GrandFather g1=new GrandFather();
        g1.gf();
        g1.home();


    }
}

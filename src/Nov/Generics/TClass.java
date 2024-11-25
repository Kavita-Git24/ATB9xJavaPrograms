package Nov.Generics;

public class TClass {
    public static void main(String[] args) {
        Test <Integer> t1=new <Integer>Test(5);
        System.out.println(t1.getObj());

        Test <Double> t2=new <Double>Test(15.5);
        System.out.println(t2.getObj());

        Test <String> t3=new <String>Test("Sneha");
        System.out.println(t3.getObj());
    }
}
class Test <T>{
    T obj;
    Test(T obj)
    {
        this.obj=obj;
    }

    public T getObj()
    {
        return this.obj;
    }
}

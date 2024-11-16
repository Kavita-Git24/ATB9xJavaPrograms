package Nov.ex_14112024_Static_Enum;

public class Lab164_Static_IIB_SIB {
    public static void main(String[] args) {
       // new A();//SIB IIB is called when object is created
        //A a1;//only reference creation does not call SIB
        A a1=new A();
        A a2=new A();
    }
}

class A{
    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
}
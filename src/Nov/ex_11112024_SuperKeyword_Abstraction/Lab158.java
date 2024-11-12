package Nov.ex_11112024_SuperKeyword_Abstraction;

public class Lab158 {
    public static void main(String[] args) {
        Child c=new Child();
        c.loan50k();
        c.loan20K();
    }
}
class Child extends Father{

    @Override
    public void loan50k() {
        System.out.println("Child is giving 50K loan");
    }
}
abstract class Father{
    abstract void loan50k();
    void loan20K()
    {
        System.out.println("Paid by Father!!!");
    }
}

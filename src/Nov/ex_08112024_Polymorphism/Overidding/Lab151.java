package Nov.ex_08112024_Polymorphism.Overidding;

public class Lab151 {
    public static void main(String[] args) {
        Sunita s=new Sunita();
        s.home();

        Father f=new Father();
        f.home();

        Father f1=new Sunita();
        f1.home();
    }
}
class Father
{
    void home()
    {
        System.out.println("2BHK");
    }

}
class Sunita extends Father
{
    /*@Override
    void home()
    {
        System.out.println("3BHK");
    }*/

}

package Nov.ex_11112024_SuperKeyword_Abstraction;

public class Lab159 {
    public static void main(String[] args) {
        WagonR r=new WagonR();
        r.drive();
        Tesla t=new Tesla();
        t.drive();

        /*Engine e=new Engine() ;
        We cannot create object of abstract class because it is incomplete in nature*/


    }
}
class WagonR extends Engine{
    void drive()
    {
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");
    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}

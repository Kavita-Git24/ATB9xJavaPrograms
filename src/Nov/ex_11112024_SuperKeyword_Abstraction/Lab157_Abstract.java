package Nov.ex_11112024_SuperKeyword_Abstraction;

public class Lab157_Abstract {
}
class trupti extends Loan{
    @Override
    void loan50k() {
        System.out.println("50k loan");
    }

    @Override
    void loan30k() {
        System.out.println("30k loan");
    }
}
abstract class Loan{
    //abstract class have incomplete method means there is no defination only declartion of methods
    abstract void loan50k();
    abstract void loan30k();
}

//Concrete class or complete class which does not have any incomplete methods
class student{}
class employee{}

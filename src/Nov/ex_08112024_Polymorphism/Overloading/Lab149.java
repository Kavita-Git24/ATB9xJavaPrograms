package Nov.ex_08112024_Polymorphism.Overloading;

public class Lab149 {
    public static void main(String[] args) {
        MathOperations mathOperations=new MathOperations();
        int result1=mathOperations.add(5,6);
        System.out.println(result1);

        float result2=mathOperations.add(5.5f,6.5f);
        System.out.println(result2);

        int result3=mathOperations.add(5,6,10);
        System.out.println(result3);

        double result4=mathOperations.add(5.9696,6.9494);
        System.out.println(result4);

        double result5=mathOperations.add(5.9696,6.9494,8.5120);
        System.out.println(result5);
    }
}

class MathOperations{
    int add(int a,int b)
    {
        return a+b;
    }

    float add(float a,float b)
    {
        return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;
    }

    double add(double a,double b)
    {
        return a+b;
    }

    double add(double a,double b,double c)
    {
        return a+b+c;
    }


}

package Oct.ex_24102024;

import java.util.Scanner;

public class Lab117 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Please enter valid integer number where number1 should be greater than number2");
        System.out.println("Enter number1");
        a=sc.nextInt();
        System.out.println("Enter number2");
        b=sc.nextInt();
        if(a>b)
        {
            int result_add = Add(a,b);
            System.out.println("Addition-> " +result_add);

            int result_sub = Sub(a,b);
            System.out.println("Subtraction-> " +result_sub);

            if(b!=0)
            {
                int result_div = Div(a, b);
                System.out.println("Division-> " + result_div);
            }
            else
            {
                System.out.println("Enter valid numbers");
            }

            int result_mul = Mul(a,b);
            System.out.println("Addition-> " +result_mul);

            sc.close();
        }
        else
        {
            System.out.println("Enter valid numbers");
        }
    }
    static int Add(int a,int b)
    {
        return a+b;
    }

    static int Sub(int a,int b)
    {
        return a-b;
    }

    static int Mul(int a,int b)
    {
        return a*b;
    }

    static int Div(int a,int b)
    {
        return a/b;
    }
}

package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_23102024_function {
    public static void main(String[] args) {
        /*Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)

        3 → user input
        4 - user input

        sum(3,4)*/

        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Number1 should be greater than or equal to Number2");
        System.out.println("Enter number1");
        a= sc.nextInt();
        System.out.println("Enter number2");
        b= sc.nextInt();
        if(a>b)
        {
            int result;

            result = Div(a, b);
            System.out.println("Division-> " + result);

            result = Mul(a, b);
            System.out.println("Multiplication-> " + result);

            result = Add(a, b);
            System.out.println("Addition-> " + result);

            result = Sub(a, b);
            System.out.println("Subtraction-> " + result);
        }
        else
        {
            System.out.println("Please enter valid numbers");
        }

    }

    static int Sub(int a1,int b1)
    {
        return a1-b1;
    }

    static int Add(int a1,int b1)
    {
        return a1+b1;
    }
    static int Mul(int a1,int b1)
    {
        return a1*b1;
    }
    static int Div(int a1,int b1)
    {
        return a1/b1;
    }
}

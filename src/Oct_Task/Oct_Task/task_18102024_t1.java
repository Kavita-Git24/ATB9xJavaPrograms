package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_18102024_t1 {
    public static void main(String[] args) {
        /*Create a simple calculator that performs addition, subtraction, multiplication,
                and division, modus based on user input using switch statements.

                Inputs :   num 1, num 2, +
                Output :  num1+num2 → print information.*/

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number2");
        int num2 = sc.nextInt();

        if(num2>num1)
        {
            System.out.println("Select operation");
            System.out.println(" 1. For Addition \n 2. For Subtraction \n 3. for Multiplication \n " +
                    "4. For Division \n 5. For Modulus");
            int operation = sc.nextInt();

            switch (operation)
            {
                case 1:
                    System.out.println("Addition: " +(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction: " +(num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication: " +(num1*num2));
                    break;
                case 4:
                    System.out.println("Division: " +(num2/num1));
                    break;
                case 5:
                    System.out.println("Modulus: " +(num2%num1));
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
        else
        {
            System.out.println("Please enter number2 greater than number1");
        }
        sc.close();
    }
}

package Oct_Task.Oct_Task;

import javax.xml.transform.Source;
import java.util.Scanner;

public class task_18102024_t3 {
    public static void main(String[] args) {
    /*    Write a program that converts between different units
        (e.g., kilometers to miles, Celsius to Fahrenheit)
        based on user selection using a switch statement.
                Input. -
                choice - 1 - km → m, km → 1km
        choice - 2 - f → c, f → c*/
        System.out.println(" 1. km --> Miles \n 2. Miles --> km \n 3. Fahrenheit --> Celsius \n 4. Celsius --> Fahrenheit  ");
        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();
        double input,result;

        switch (operation)
        {
            case 1:
                System.out.println("Enter distance in Kilometer");
                input=sc.nextDouble();
                result = (input * 0.62137119);
                System.out.println("Miles-->" +result);
                break;
            case 2:
                System.out.println("Enter distance in Miles");
                input =sc.nextDouble();
                result = input / 0.621371;
                System.out.println("Miles-->" +result);
                break;
            case 3:
                System.out.println("Enter temperature in Fahrenheit");
                input= sc.nextDouble();
                result = (input - 32)*5/9;
                System.out.println("Celsius -->" + result);
                break;
            case 4:
                System.out.println("Enter temperature in Celsius");
                input= sc.nextDouble();
                result = (input * 9/5) + 32;
                System.out.println("Fahrenheit -->" + result);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        sc.close();
    }
}

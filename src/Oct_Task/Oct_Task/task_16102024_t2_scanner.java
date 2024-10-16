package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_16102024_t2_scanner {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1= sc.nextInt();
        System.out.println("Enter Second Number");
        int num2= sc.nextInt();
        int result=(num1>num2)?num1:num2;
        System.out.println("The largest number is: "+result);

    }
}

package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_16102024_t2_scanner {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int num1= Integer.parseInt(args[0]);
        int num2=Integer.parseInt( args[1]);
        int result1=(num1>=num2)?num1:num2;
        System.out.println("The largest number is: "+result1);

        int num3= Integer.parseInt(args[2]);

        int result2=(num1>=num2 && num1>=num3)?num1:(num2>=num3)?num2:num3;
        System.out.println("The largest number is: "+result2);

    }
}

package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab072_If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num 1:");
        int num1=sc.nextInt();
        System.out.println("Enter Num 2:");
        int num2= sc.nextInt();
        if(num1>num2)
            System.out.println("Num 1 > Num 2");
        else if (num2>num1)
            System.out.println("Num 2 > Num 1");
        else
            System.out.println("Equal");
    }
}

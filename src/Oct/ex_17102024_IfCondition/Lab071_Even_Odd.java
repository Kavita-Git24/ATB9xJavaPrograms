package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab071_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number id odd");
        sc.close();
    }
}

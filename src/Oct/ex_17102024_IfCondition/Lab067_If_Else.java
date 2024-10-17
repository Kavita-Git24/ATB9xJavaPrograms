package Oct.ex_17102024_IfCondition;

import java.util.Scanner;

public class Lab067_If_Else {
    public static void main(String[] args) {
        System.out.println("Enter Age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Allowed to vote");
        }
        else
        {
            System.out.println("Not Allowed to vote");
        }
        sc.close();
    }
}

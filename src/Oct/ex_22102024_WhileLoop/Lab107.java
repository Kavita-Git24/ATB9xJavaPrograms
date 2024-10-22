package Oct.ex_22102024_WhileLoop;

import java.util.Scanner;

public class Lab107 {
    public static void main(String[] args) {
        String arg_age_string=args[0];
        int age=Integer.parseInt(arg_age_string);
        System.out.println(age);
        while(age>0){
            System.out.println(age);
            age--;
        }
        /*Scanner sc=new Scanner(System.in);
        sc.nextInt();*/
    }
}

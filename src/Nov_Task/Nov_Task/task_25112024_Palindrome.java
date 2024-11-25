package Nov_Task.Nov_Task;

import java.util.Scanner;

public class task_25112024_Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");
        String input=sc.nextLine();

        boolean ans=is_palindrome(input);

        if(ans==true)
            System.out.println("Input String is palindrome");
        else
            System.out.println("Input String is not palindrome");

        sc.close();
    }
    static boolean is_palindrome(String s)
    {
        String reverse_String="";
        boolean is_palindrome=false;

        for(int i=s.length()-1;i>=0;i--){
            reverse_String=reverse_String+s.charAt(i);
        }

        if(s.equals(reverse_String))
            is_palindrome=true;

        return is_palindrome;
    }
}

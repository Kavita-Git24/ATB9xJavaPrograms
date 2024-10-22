package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_22102024_Palindrome {
    public static void main(String[] args) {
        //Palidrome of String (chatAt())

        String revString="";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String st= sc.nextLine().toLowerCase();
        int lenght=st.length();
        for (int i=lenght-1;i>=0;i--)
        {
            revString = revString+st.charAt(i);
        }
        if(st.equals(revString))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }
}

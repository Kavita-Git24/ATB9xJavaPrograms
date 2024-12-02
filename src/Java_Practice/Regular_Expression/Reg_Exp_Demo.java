package Java_Practice.Regular_Expression;

import java.util.regex.Pattern;

public class Reg_Exp_Demo {
    public static void main(String[] args) {
       boolean result= Pattern.matches(".*Mira.*","My name is Mira. Mira is a good girl");
       if(result)
       {
           System.out.println("Matched");
       }
       else
       {
           System.out.println("Not Matched");
       }
    }

}

package Java_Practice.Regular_Expression;

import java.util.regex.Pattern;

public class Reg_Exp_P2 {
    public static void main(String[] args) {
//        Pattern pattern=Pattern.compile(".*Mira.*");
//        Matcher matcher=pattern.matcher("My name is Mira. Mira is a good girl");
//        boolean result=matcher.matches();

        boolean result = Pattern.compile(".*Mira.*").matcher("My name is Mira. Mira is a good girl").matches();

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

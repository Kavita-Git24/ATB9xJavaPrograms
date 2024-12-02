package Java_Practice.Regular_Expression;

import java.util.regex.Pattern;

public class Reg_Exp_P3 {
    public static void main(String[] args) {
        boolean result1= Pattern.matches("[Jj]ava","Java");
        System.out.println(result1);
        boolean result2= Pattern.matches("[Jj]ava","java");
        System.out.println(result2);
        boolean result3= Pattern.matches("ye[sp]","yes");
        System.out.println(result3);
        boolean result4= Pattern.matches("ye[sp]","yep");
        System.out.println(result4);
        boolean result5= Pattern.matches("ye[sp]","yet");
        System.out.println(result5);
        boolean result6= Pattern.matches("[sfk]it","sit");
        System.out.println(result6);
        boolean result7= Pattern.matches(".ava","guava");
        System.out.println(result7);
        boolean result8= Pattern.matches(".ava","java");
        System.out.println(result8);
        boolean result9= Pattern.matches("[0-9]am","5am");
        System.out.println(result9);
        boolean result10= Pattern.matches("[^0-9]am","sam");
        System.out.println(result10);
        boolean result11= Pattern.matches("\\dam","10am");
        System.out.println(result11);
    }
}

package Java_Practice.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.nextLine();
        int result=roman_to_intger(s.toUpperCase());
        System.out.println("Integer Value of Roman: " +result);
    }
    public static int roman_to_intger(String s)
    {
        Map <Character,Integer> mp=new HashMap();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if( i<s.length()-1 && mp.get(s.charAt(i))<mp.get(s.charAt(i+1)))
            {
                ans-=mp.get(s.charAt(i));
            }
            else
            {
                ans+=mp.get(s.charAt(i));
            }
        }
        return ans;
    }
}

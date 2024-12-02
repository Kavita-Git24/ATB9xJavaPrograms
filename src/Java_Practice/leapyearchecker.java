package Java_Practice;

import java.util.Scanner;

public class leapyearchecker {
    public static void main(String[] args) {
        System.out.println("Enter Year: ");
        Scanner sc=new Scanner(System.in);
        int year;
        year= sc.nextInt();
        boolean is_leap_year = leap_year(year);

        if(is_leap_year==true)
            System.out.println("It's Leap Year");
        else
            System.out.println("It's not Leap Year");
    }

    public static boolean leap_year(int num)
    {
        boolean is_leap=false;
        if((num % 4 ==0 && num % 100 != 0)|| (num%400==0))
            is_leap=true;
        else
            is_leap=false;

            return is_leap;
    }

}

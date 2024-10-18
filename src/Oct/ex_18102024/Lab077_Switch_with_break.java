package Oct.ex_18102024;

import java.util.Scanner;

public class Lab077_Switch_with_break {
    public static void main(String[] args) {
        System.out.println("Enter Browser");
        Scanner sc=new Scanner(System.in);
        String browser= sc.next();
        switch (browser.toLowerCase())
        {
            default:
                System.out.println("It is not browser");
                break;
            case "internet":
                System.out.println("Started Testing in Internet Explorer");
                break;
            case "firefox":
                System.out.println("Started Testing in Firefox");
                break;
            case "edge":
                System.out.println("Started Testing in Microsoft Edge");
                break;
        }
        sc.close();
    }
}

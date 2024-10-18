package Oct_Task.Oct_Task;

import java.util.Scanner;

public class task_17102024_t2 {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.

       // Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1-->");
        int side1=sc.nextInt();
        System.out.println("Enter side2-->");
        int side2=sc.nextInt();
        System.out.println("Enter side3-->");
        int side3=sc.nextInt();
        if(side1<0 || side2<0 || side3 <0)
        {
            System.out.println("Invalid Input, please enter positive side lengths");
        }
        else if(side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("Triangle is Equilateral");
        }
        else if(side1==side2 && side1!=side3 ||side2==side3 && side2!=side1 || side1==side3 && side2!=side3 )
        {
            System.out.println("Triangle is Isosceles");
        }
        else if(side1!=side2 && side1!=side3 && side2!=side3)
        {
            System.out.println("Triangle is Scalene");
        }

        sc.close();
    }
}

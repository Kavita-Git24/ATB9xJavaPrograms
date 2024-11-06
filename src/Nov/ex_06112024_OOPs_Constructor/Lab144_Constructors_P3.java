package Nov.ex_06112024_OOPs_Constructor;

import java.util.Scanner;

public class Lab144_Constructors_P3 {
    public static void main(String[] args) {


        Car3 t1 = new Car3();
        t1.display();

    }
}
     class Car3 {
        String name;
        int year;
        String model;
        Car3()
        {
                name="Tesla";
                model="D Model";
                year=1990;
                System.out.println("PC");
        }
        void display()
        {
            System.out.println(this.name +" "+ this.model +" "+ this.year);
        }
    }


package Nov.ex_06112024_OOPs_Constructor;

import java.util.Scanner;

public class Lab143_Constructors_P2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car2 t1 = new Car2("Tesla","Mini",2015);
        t1.display();


        Car2 t2 = new Car2("Neno","Mini",2013);

        System.out.println(t2.name);
        System.out.println(t2.model);
        System.out.println(t2.year);

        System.out.println("Enter name");
        String car_name=sc.next();

        System.out.println("Enter model");
        String model_name=sc.next();

        System.out.println("Enter Year");
        int year=sc.nextInt();

        Car2 t3 = new Car2(car_name,model_name,year);

        /*System.out.println(t3.name);
        System.out.println(t3.model);
        System.out.println(t3.year);*/

        t3.display();

    }
}
     class Car2 {
        String name;
        int year;
        String model;
        Car2(String car_name,String car_model,int car_year)
        {
        this.name=car_name;
        this.model=car_model;
        this.year=car_year;
        System.out.println("PC");
        }
        void display()
        {
            System.out.println(this.name +" "+ this.model +" "+ this.year);
        }
    }


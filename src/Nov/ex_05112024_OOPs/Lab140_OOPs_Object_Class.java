package Nov.ex_05112024_OOPs;

public class Lab140_OOPs_Object_Class {
    public static void main(String[] args) {
        Cat c2 = new Cat();
        c2.name = "Rose";
        c2.sleep();
        System.out.println(c2.name);

    }
}
    class Cat{
        String name;
        void sleep()
        {
            System.out.println("Sleeping");
        }
    }


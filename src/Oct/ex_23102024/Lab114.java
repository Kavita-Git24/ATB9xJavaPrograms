package Oct.ex_23102024;

public class Lab114 {
    public static void main(String[] args) {
        //User Defined Functions

        // 1.Without Parameters and Without Return Types
            greet();
        // 2.Without Parameters but With Return Types
        String returned_value= greet_with_hello();
        System.out.println(returned_value);

        int voting_age=age_of_vote();
        System.out.println(voting_age);
        if(voting_age>=18)
            System.out.println("You are allowed to vote!");
        else
            System.out.println("You are not allowed to vote!");
        // 3.With Parameters but Without Return Types
            greet_with_your_name("John");
            greet_with_your_name("Smith");

            greet_with_firstname_lastname("Jiya","Khanna");
        // 4.With Parameters but With Return Types
            int result=sum(10,15);
            System.out.println("Sum-> "+result);
    }

    // 1.Without Parameters and Without Return Types
    static void greet()
    {
        System.out.println("Hello, How are you?");
    }

    // 2.Without Parameters but With Return Types
    static String greet_with_hello()
    {
        System.out.println("Hi, I am Type 2");
        return "Hi, You are awesome.";
    }

    static int age_of_vote()
    {
        System.out.println("Vote age Returned!");
        return 18;
    }

    static void greet_with_your_name(String name)
    {
        System.out.println("Hi, Your name is " +name);
    }

    static void greet_with_firstname_lastname(String firstname,String lastname)
    {
        System.out.println("Hi, Your name is " +firstname +" " +lastname);
    }

    static int sum(int a,int b)
    {
        return (a+b);
    }


}

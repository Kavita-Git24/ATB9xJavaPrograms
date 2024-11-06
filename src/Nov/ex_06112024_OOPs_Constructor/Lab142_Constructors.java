package Nov.ex_06112024_OOPs_Constructor;

public class Lab142_Constructors {
    public static void main(String[] args) {
        Car tesla=new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car neno=new Car();
        neno.name="Tata Neno";
        neno.model="Mini";
        neno.year=2024;

        System.out.println(neno.name);
        System.out.println(neno.model);
        System.out.println(neno.year);
    }
}

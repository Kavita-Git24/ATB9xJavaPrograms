package Oct.ex_25102024_String;

public class Lab121_String_Immutable {
    public static void main(String[] args) {
        String name="julie";
        System.out.println("Initial-> "+name);
        name.toUpperCase();
        System.out.println("After Conversion ->" +name); //so it floats in string pool

    }
}

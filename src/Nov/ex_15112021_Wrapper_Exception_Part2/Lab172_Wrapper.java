package Nov.ex_15112021_Wrapper_Exception_Part2;

public class Lab172_Wrapper {
    public static void main(String[] args) {
        int a1=10;
        Integer b=a1; //boxing int -> Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b);
        System.out.println(b.intValue());

        Integer a2=42;
        int value=a2; //unboxing Integer->int;
        System.out.println(value);

    }
}

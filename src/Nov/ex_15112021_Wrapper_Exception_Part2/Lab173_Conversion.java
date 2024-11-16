package Nov.ex_15112021_Wrapper_Exception_Part2;

public class Lab173_Conversion {
    public static void main(String[] args) {
        String num="10";
        //String ->Wrapper(Integer)->Primitive Int
        Integer a=Integer.valueOf(num);
        int a2=a;//unboxing
        System.out.println(a2);

        //String to primitive
        int a3=Integer.parseInt(num);
        System.out.println(a3);

        Long l=10l;
        Short s=23;
        Boolean bb=true;


    }
}

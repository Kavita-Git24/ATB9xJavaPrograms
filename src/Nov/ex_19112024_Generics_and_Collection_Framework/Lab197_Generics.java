package Nov.ex_19112024_Generics_and_Collection_Framework;

public class Lab197_Generics {
    public static void main(String[] args) {
        System.out.println(temp_sum(10,20));
        System.out.println(temp_sum("ram","rahim"));
    }
    public static Integer temp_sum(Integer a, Integer b)
    {
        return a+b;
    }

    public static String temp_sum(String a, String b)
    {
        return a+b;
    }
}

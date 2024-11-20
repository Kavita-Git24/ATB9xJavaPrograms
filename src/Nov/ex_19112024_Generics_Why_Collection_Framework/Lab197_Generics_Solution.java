package Nov.ex_19112024_Generics_Why_Collection_Framework;

public class Lab197_Generics_Solution {
    public static void main(String[] args) {
       temp_sum(10,20);
       temp_sum("ram","rahim");
    }
    public static <T> T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }


}

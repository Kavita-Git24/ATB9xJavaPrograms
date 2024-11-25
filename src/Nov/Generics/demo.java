package Nov.Generics;

public class demo {
    public static void main(String[] args) {
        temp(4);
        temp(8.5);
        temp("mona");
    }
    public static <T> void temp(T a)
    {
        System.out.println(a);
    }

}

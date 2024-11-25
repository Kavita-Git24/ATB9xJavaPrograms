package Nov.Generics;

public class MaxThree {
    public static void main(String[] args) {
        System.out.println(maximumOf(4,8,9));
        System.out.println(maximumOf(7.8,19.5,82.5));
        System.out.println(maximumOf('r','e','t'));
        System.out.println(maximumOf("rima","sim","pim"));
    }

    public static<T extends Comparable<T>> T maximumOf(T a, T b, T c)
    {
        T max=a;
        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}

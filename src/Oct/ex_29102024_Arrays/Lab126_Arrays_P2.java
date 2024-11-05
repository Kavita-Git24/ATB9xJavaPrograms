package Oct.ex_29102024_Arrays;

public class Lab126_Arrays_P2 {
    public static void main(String[] args) {
        //Creation, Size-Fix
        int[] marks_2=new int[5]; //Fixed Size
       // type[] arrayname=new type[size];
        System.out.println(marks_2.length);
        marks_2[0]=78;
        marks_2[1]=85;
        marks_2[2]=82;
        marks_2[3]=46;
        marks_2[4]=50;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
        System.out.println(marks_2[-1]); //ArrayIndexOutOfBoundsException
        System.out.println(marks_2[10]); //ArrayIndexOutOfBoundsException
    }
}

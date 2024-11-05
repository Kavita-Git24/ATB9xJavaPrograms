package Oct.ex_29102024_Arrays;

public class Lab125_Arrays_P1 {
    public static void main(String[] args) {
        int[] marks={85, 80, 91, 96, 75, 82, 96};
        //Array with predefined elements
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        System.out.println(marks[10]);//ArrayIndexOutOfBoundsException
        System.out.println(marks.length);
    }
}

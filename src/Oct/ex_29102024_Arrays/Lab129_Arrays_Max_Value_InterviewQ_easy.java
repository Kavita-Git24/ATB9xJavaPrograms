package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class Lab129_Arrays_Max_Value_InterviewQ_easy {
    public static void main(String[] args) {
        int[] array={25,14,56,16,78,63,45,43,23};
        Arrays.sort(array);
        System.out.println("Minimum Value-> " + array[0]);
        System.out.println("Maximum Value-> " + array[array.length-1]);

    }

}


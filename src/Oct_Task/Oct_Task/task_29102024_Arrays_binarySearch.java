package Oct_Task.Oct_Task;

import java.util.Arrays;

public class task_29102024_Arrays_binarySearch {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int key=30;
        int result=Arrays.binarySearch(array,key);
        if(result<0)
            System.out.println("Element is not found");
        else
            System.out.println("Element is found at index: "+result);
    }
}

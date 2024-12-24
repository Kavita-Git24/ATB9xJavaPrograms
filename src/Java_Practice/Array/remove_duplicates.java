package Java_Practice.Array;

import java.util.Arrays;
import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {

       int[] num_arr={1,1,1,22,55,4,4};
       int result=removeduplicate(num_arr);
        System.out.println(result);
    }
    public static int removeduplicate(int[] nums) {
        Arrays.sort(nums);
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}

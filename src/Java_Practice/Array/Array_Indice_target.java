package Java_Practice.Array;

import java.util.HashMap;
import java.util.Map;

public class Array_Indice_target {
    public static void main(String[] args) {
        int[] nums={2,4,3};
        int target=6;
        Sum_Array(nums,target);
    }
    public static void Sum_Array(int[] nums,int target)
    {
        Map <Integer,Integer> h=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(h.containsKey(diff))
            {
                System.out.println("["+h.get(diff)+","+i +"]");
            }
            h.put(nums[i],i);
        }


    }
}

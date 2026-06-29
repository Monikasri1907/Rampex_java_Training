package Day_8.Class_task;

import java.util.Arrays;

public class Rotate_array_usingwhile {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        int n=nums.length;
        int left=0;
        int right=n-1;
        int temp;
        while(left<n/2){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            System.out.println(Arrays.toString(nums));
            left++;
            right--;
        }
        System.out.println("Final output");
        System.out.println(Arrays.toString(nums));
    }
}

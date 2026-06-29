package Day_8.Home_task;

import java.util.Arrays;
public class Remove_duplicates {
    public static void main(String[] args) {
        int j;
        int[] nums = {4, 2, 4, 6, 2, 7, 6, 8};
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            for (j = 0; j < n ; j++) {
                if (nums[i] == nums[j]) {
                    break;
                }

                }
            if(i==j){
                System.out.print(nums[i]+" ");

            }

        }

    }
}

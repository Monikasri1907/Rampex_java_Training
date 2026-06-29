package Day_8.Class_task;

import java.util.Arrays;
public class Movezeros_toright {
    public static void main(String[] args) {
        int[] nums = {2, 0, 3, 0, 5,0,9,8,0};
        int position=0;
        int[] n1 = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            if (nums[i] != 0) {
                n1[position] = nums[i];
                position++;

            }
        }
        System.out.println(Arrays.toString(n1));
    }
}

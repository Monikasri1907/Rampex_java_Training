package Day_8.Class_task;
import java.util.Arrays;
public class Rotate_arary {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        int n=nums.length;
        int left=0;
        int right=n-1;
        int temp;
        for(int i=1;i<=n/2;i++){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
            System.out.println(Arrays.toString(nums));
        }
        System.out.println("Final output");
        System.out.println(Arrays.toString(nums));
    }
}

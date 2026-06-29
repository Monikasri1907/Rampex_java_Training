package Day_8.Home_task;

public class Find_the_missing_number {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        int[] nums = {1, 2, 4, 5, 6, 7, 8};
        int a = n * (n + 1) / 2;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];
        }
        int b=a-sum;
        System.out.println(b);
    }
}

package Day_8.Home_task;

public class Find_duplicates {
    public static void main(String[] args){
        int[] nums={2,5,7,2,8,5,9,7,7};
        int n= nums.length;
        int k;
        for(int i=0;i<n;i++){
            for( k=0;k<i;k++){
                if(nums[i]==nums[k]){
                    break;
                }
            }
            if(i!=k){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i] + " ");
                   break;
                }
            }

        }
    }
}

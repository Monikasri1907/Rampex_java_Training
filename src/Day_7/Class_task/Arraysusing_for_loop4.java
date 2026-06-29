package Day_7.Class_task;

import java.util.Arrays;

public class Arraysusing_for_loop4 {
    public static void main(String[] args){
        int[] num=new int[10];
        for(int index=0;index<=9;index++){
            num[index]=index;
            System.out.println(Arrays.toString(num));
        }
    }
}

package Day_7.Class_task;

import java.util.Arrays;

public class Evenarray {
        public static void main(String[] args){
            int[] num=new int[5];
            for(int index=0;index<=4;index=index+2 ){
                num[index]=(index*2)-1 ;
                System.out.println(Arrays.toString(num));
            }
        }
}

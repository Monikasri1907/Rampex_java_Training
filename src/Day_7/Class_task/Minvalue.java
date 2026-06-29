package Day_7.Class_task;

public class Minvalue {
    public static void main(String[] args){
        int[] arr={1,9,7,6,8};
        int min=10000;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("The min value is :" + min);
    }
}

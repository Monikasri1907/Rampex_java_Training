package Day_7.Class_task;

public class Secondmax {
    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 8,6,2};
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }

            else if(arr[i]>secondmax  &&  arr[i] != max){

                secondmax =arr[i];
            }

        }
        System.out.println("The Second max value is :" + secondmax);

    }
}
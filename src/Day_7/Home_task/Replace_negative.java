package Day_7.Home_task;

public class Replace_negative {
        public static void main(String[] args) {

            int[] arr = {5, -2, 8, -7, 3};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0)
                    arr[i] = 0;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
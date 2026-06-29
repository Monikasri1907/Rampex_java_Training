package Day_7.Home_task;

public class Right_rotate {
        public static void main(String[] args) {

            int[] arr = {1, 2, 3, 4, 5};
            int[] rev = new int[arr.length];

            int j = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                rev[j] = arr[i];
                j++;
            }

            for (int i = 0; i < rev.length; i++) {
                System.out.print(rev[i] + " ");
            }
        }
    }

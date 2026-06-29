package Day_7.Home_task;

public class Even_odd_count {
        public static void main(String[] args) {

            int[] arr = {10, 15, 20, 25, 30, 7};

            int even = 0;
            int odd = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }

            System.out.println("Even = " + even);
            System.out.println("Odd = " + odd);
        }
    }


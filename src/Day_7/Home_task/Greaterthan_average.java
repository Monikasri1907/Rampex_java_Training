package Day_7.Home_task;

public class Greaterthan_average {
        public static void main(String[] args) {

            int[] arr = {10, 20, 30, 40, 50};

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            double avg = (double) sum / arr.length;

            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > avg)
                    count++;
            }

            System.out.println("Average = " + avg);
            System.out.println("Count = " + count);
        }
}

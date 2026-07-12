package Day_13.Home_task;

public class Alphabetpyramid {
    public static void main(String[] args) {
        int n = 65;
        for (int i = 0; i < 6; i++) {
            for (int j =0; j <6-i; j++) {
                System.out.println(" ");
            }
                for (int k = 0; k <= i; k++) {
                    System.out.print((char) (n + k) +" ");
                }
                System.out.println();
            }

        }
    }

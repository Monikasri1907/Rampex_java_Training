package Day_6.Class_Task;

public class Reverse_pyramid {
    public static void main(String[] args) {
        for (int i = 5; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

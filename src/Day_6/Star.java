package Day_6;

public class Star {
    static void main(String[] args) {
        for (int i = 5; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

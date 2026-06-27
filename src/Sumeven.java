package Day_6;
import java.util.Scanner;
public class Sumeven {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n-1; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}


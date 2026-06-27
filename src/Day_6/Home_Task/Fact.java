package Day_6.Home_Task;
import java.util.Scanner;
public class Fact {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();

            int count = 0;

            while (n > 0) {
                n = n / 5;
                count = count + n;
            }

            System.out.println("Trailing zeroes = " + count);
        }
    }


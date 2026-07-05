package Day_2;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount");
        double P = sc.nextDouble();

        System.out.println("Enter Rate of Interest");
        double R = sc.nextDouble();

        System.out.println("Enter Time:");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;

        System.out.println("Simple Interest: " + SI);
    }
}

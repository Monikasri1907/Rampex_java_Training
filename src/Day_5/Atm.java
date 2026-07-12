package Day_5;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int originalPin = 1625 ;
        int availableAmount = 100000;
        String cardInfo = "yes";
        int transactionLimit=10000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your card (yes/no): ");
        String card = sc.nextLine();

        if (cardInfo.equalsIgnoreCase(card)) {

            System.out.println("Welcome!");

            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();
            if (pin >= 1000 && pin <= 9999) {

                if (pin == originalPin) {

                    System.out.print("Enter withdrawal amount: ");
                    int amount = sc.nextInt();

                    if (amount > 0) {
                        if(amount >= transactionLimit){
                            System.out.println("Transaction Limit Exceeded");
                            System.out.println("Maximum withdrawal limit is: " + transactionLimit);
                        }

                        else if (amount <= availableAmount) {

                            int remainingBalance = availableAmount - amount;

                            System.out.println("Transaction Successful");
                            System.out.println("Debited Amount: " + amount);
                            System.out.println("Remaining Balance: " + remainingBalance);
                            System.out.println("Thank you!");

                        } else {
                            System.out.println("Insufficient Balance");
                        }

                    }
                    else {
                        System.out.println("Invalid Amount");
                    }

                } else {
                    System.out.println("Wrong PIN");
                }

            } else {
                System.out.println("PIN must contain exactly 4 digits");
            }

        } else {
            System.out.println("Please insert the card");
        }
    }
}

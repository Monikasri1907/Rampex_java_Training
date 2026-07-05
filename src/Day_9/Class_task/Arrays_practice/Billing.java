package Day_9.Class_task.Arrays_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        String[] drinks = {"Sprite", "Pepsi", "Campa", "Maza"};
        int[] prices = {40, 40, 10, 45};
        int[] stocks = {5, 8, 9, 6};
        int total = 0;
        int grandtotal=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the drinks:");
            String name = sc.nextLine();
            if (name.equals("exit")) {
                System.out.println("Thank you");
                break;
            }
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < drinks.length; i++) {
                if (name.equalsIgnoreCase(drinks[i])) {
                    if (quantity > stocks[i]) {
                        System.out.println("Insufficient Stocks");
                        System.out.println("Available stock is" + " " + stocks[i]);

                    } else {
                        total = quantity * prices[i];
                        stocks[i] = stocks[i] - quantity;
                        System.out.println("Drink : " + drinks[i]);
                        System.out.println("Price : " + prices[i]);
                        System.out.println("Quantity :" + quantity);
                        grandtotal+=total;


                    }
                    break;
                }

                }

        }
        System.out.println("-----------------------------------------");

        System.out.println("your Grand total bill is"+ " "+grandtotal);
        System.out.println("-----------------------------------------");


        }
    }

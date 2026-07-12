package Day_10.Home_task.Assesment;
import java.util.Scanner;
import java.util.Arrays;

public class parallel_array_to_oops {
    public static void main(String[] args){
        Drink d1=new Drink();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();
        d1.drinkDetails();

    }
}
class Drink {
    String[] drink_name = {"sprite", "maza", "campa", "pepsi"};
    String[] drinks_id = {"sp10", "mz24", "cp34", "ps78"};
    int[] price = {40, 50, 25, 40};
    int[] stock = {4, 5, 2, 8};
    static String shopname = "ABC Cafe";
    int total = 0;
    int grandtotal = 0;

    Drink() {
        System.out.println(Arrays.toString(drink_name));
    }

    public void drinkDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the drink:");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("exit")) {
            System.out.println("Thank you");
        } else {
            System.out.println("Enter the quantity:");
            int qty = sc.nextInt();

            for (int i = 0; i < drink_name.length; i++) {
                if (name.equalsIgnoreCase(drink_name[i])) {
                    if (qty > stock[i]) {
                        System.out.println("Insufficient Stocks");
                        System.out.println("Available stock is" + " " + stock[i]);

                    } else {
                        total = qty * price[i];
                        stock[i] = stock[i] - qty;
                        System.out.println("Drink : " + drink_name[i]);
                        System.out.println("Price : " + price[i]);
                        System.out.println("Quantity :" + qty);
                        grandtotal += total;
                        System.out.println("-------------------------------");
                        System.out.println("Total amount is" + grandtotal);
                        System.out.println("-------------------------------");

                    }

                }
            }
        }
    }
        }



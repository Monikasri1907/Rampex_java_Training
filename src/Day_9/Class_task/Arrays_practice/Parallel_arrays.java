package Day_9.Class_task.Arrays_practice;

import java.util.Scanner;

public class Parallel_arrays {
    public static void main(String[] args){
        String[] drinks={"Sprite","Pepsi","Campa","Maza"};
        int[] prices={40,40,10,45};
        int[] stocks={5,5,5,5};
        int total=0;
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the drinks:");
            String name = sc.nextLine();
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            for (int i = 0; i < drinks.length; i++) {
                if (name.equals(drinks[i])) {
                    total = prices[i] * quantity;
                }
                int remaining=stocks[i]-quantity;
            }
            System.out.println(total);

        }
    }
}

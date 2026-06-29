package Day_8.Class_task;
import java.util.Scanner;
public class Total_bill {
    public static void main(String[] args){
        int total;
        String[] drinks={"Sprite","Pepsi","Campa","Maza"};
        int[] prices={40,40,10,45};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the drinks:");
        String name=sc.nextLine();
        System.out.println("Enter the quantity:");
        int quantity=sc.nextInt();
        for(int i=0;i<drinks.length;i++){
            if(name.equals(drinks[i])){
                System.out.println(prices[i]* quantity);
            }
        }

    }
}

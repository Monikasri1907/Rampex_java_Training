package Day_4;

import java.util.Scanner;

public class ProductofOdd {
    public static void main(String[] args){
        int product=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        for(int i = 2; i <= n-2; i++) {
            if(i%2!=0){
                product=product*i;
            }
        }
        System.out.println(product);

    }
}

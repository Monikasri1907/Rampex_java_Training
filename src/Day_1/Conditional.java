package Day_1;

import java.util.Scanner;

public class Conditional {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=sc.nextInt();


            if(n>90){
                System.out.println("Greaterthan 90");
            }
            else if(n>50){
                System.out.println("Greaterthan 50");
            }
            else{
                System.out.println("Greaterthan 10");
            }
        }
    }


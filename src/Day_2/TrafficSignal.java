package Day_2;

import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a signal:");
        String colour = sc.nextLine();
        if(colour.equals("green")){
            System.out.println("Go");
        }
        else if(colour.equals("yellow")){
            System.out.println("Wait");
        }
        else if(colour.equals("red")){
            System.out.println("Stop");
        }
        else{
            System.out.println("invalid colour");
        }
    }
}

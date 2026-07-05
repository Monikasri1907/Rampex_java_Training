package Day_3;

import java.util.Scanner;

public class Days {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a colour:");
        String n = sc.nextLine();
        switch(n){
            case "green":{
                System.out.println("Go");
                break;
            }
            case "yellow":{
                System.out.println("Wait");
                break;

            }
            case "red":{
                System.out.println("Stop");
                break;

            }
            default:{
                System.out.println("Invalid colour");
                break;

            }
        }
    }
}

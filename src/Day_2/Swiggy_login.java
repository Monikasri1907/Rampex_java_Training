package Day_2;

import java.util.Scanner;

public class Swiggy_login {
    public static void main(String[] args){
        String originalUsername="Monikasri";
        int originalPassword=1234;
        System.out.println("Please Login");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the userName:");
        String username =sc.nextLine();
        System.out.println("Enter the password:");
        int password=sc.nextInt();
        if(originalUsername.equals(username) ){
            if(originalPassword == password){
                System.out.println("Welcome Monikasri!");
            }
            else{
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("Invalid Username");
        }
    }
}

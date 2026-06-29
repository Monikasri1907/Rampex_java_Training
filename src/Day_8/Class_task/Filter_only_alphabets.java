package Day_8.Class_task;

import java.util.Scanner;

public class Filter_only_alphabets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the user name:");
        String username=sc.nextLine();
        int n=username.length();
        for(int i=0;i<n;i++){
            if(username.charAt(i) >= 'A'&& username.charAt(i) <= 'Z' ||username.charAt(i) >= 'a'&& username.charAt(i) <= 'z') {
                System.out.print(username.charAt(i));
            }
        }
    }
}

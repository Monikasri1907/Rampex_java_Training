package Day_2;

import java.util.Scanner;

public class Grade {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the marks:");
            int marks=sc.nextInt();


            if(marks>=91 && marks<=100){
                System.out.println("Grade A");
            }
            else if(marks>=81 && marks<=90){
                System.out.println("Grade B");
            }
            else if(marks>=64 && marks<=80){
                System.out.println("Grade C");
            }
            else if(marks>=0 && marks<=64){
                System.out.println("fail");
            }
            else{
                System.out.println("Invalid marks");
            }
        }
}

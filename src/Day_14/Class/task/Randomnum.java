package Day_14.Class.task;
import java.util.Scanner;
public class Randomnum {
    public static void main(String[] args){
        int rnum=(int)(10*Math.random());
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess the number???");
        int num=sc.nextInt();
        if(num==rnum){
            System.out.println("you won :)");
        }
        else{
            System.out.println("you loss :(" + " " + "correct number is" +  " " + rnum);
        }

    }
}

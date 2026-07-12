package Day_13.Home_task;
import java.util.Scanner;
public class Reverse_every_word_in_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s1=sc.nextLine();
        String[] words=s1.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=words[i].length()-1;j>=0;j--){
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");
        }

    }

}

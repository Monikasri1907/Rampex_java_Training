package Day_16.Home.task;
import java.util.ArrayList;
import java.util.HashSet;
public class Remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (Integer a : arr) {
            num.add(a);
        }
        System.out.println(num);
        HashSet<Integer> num1 = new HashSet<Integer>();
        for(Integer a1:num){
            num1.add(a1);
        }
        System.out.println(num1);
    }

}

package Day_16.Home.task;
import java.util.HashSet;
public class RemoveDuplicates_using_hashSet {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,4,5};
        HashSet<Integer> h1=new HashSet<Integer>();
        for(Integer h:arr){
            h1.add(h);
        }
        System.out.print(h1);
    }
}

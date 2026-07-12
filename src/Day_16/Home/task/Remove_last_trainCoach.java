package Day_16.Home.task;
import java.util.LinkedList;
public class Remove_last_trainCoach {
    public static void main(String[] args){
        LinkedList<String> l1=new LinkedList<String>();
        l1.addFirst("Engine");
        l1.add("Coach 1");
        l1.add("Coach 2");
        l1.addLast("Guard");
        l1.removeLast();
        System.out.print(l1);
    }
}

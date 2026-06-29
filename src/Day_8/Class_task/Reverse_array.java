package Day_8.Class_task;
import java.util.Arrays;
public class Reverse_array {
    public static void main(String[] args){
        String[] menu={"Veg","Nonveg","Sweets","Beverages"};
        String[] m1=new String[menu.length];
        for(int i=0;i<menu.length;i++){
            m1[i]=menu[menu.length-1-i];
        }
        System.out.println(Arrays.toString(m1));

    }
}

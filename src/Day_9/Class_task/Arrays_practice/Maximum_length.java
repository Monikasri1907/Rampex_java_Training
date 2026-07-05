package Day_9.Class_task.Arrays_practice;

public class Maximum_length {
    public static void main(String[] args){
        String[] names={"ramya","kishore","saniya","priya"};
        int maximum_length=0;
        for(int i=0;i<names.length;i++) {
            if (names[i].length() > maximum_length) {
                maximum_length = names[i].length();
            }
            if(maximum_length==names[i].length()){
                System.out.println(names[i]);
            }
        }
        System.out.println(maximum_length);
    }

    }

package Day_6.Home_Task;

public class Stop_afterwednesday {
    public static void main(String[] args){
        int dayscompleted=0;
        for(int month=1;month<=12;month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    if(day==4){
                        break;
                    }
                    System.out.println("Working Days");
                    System.out.println("Month" + month + "-" + "week" + week + "-" + "Day:" + day + "Days Completed:" + ++dayscompleted);
                    System.out.println("Come to college" + "Study and go");
                }
            }
        }
    }
}

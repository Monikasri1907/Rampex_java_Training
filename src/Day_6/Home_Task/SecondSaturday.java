package Day_6.Home_Task;

public class SecondSaturday {
    public static void main(String[] args){
        int dayscompleted=0;
        for(int month=1;month<=12;month++) {
            for (int week = 1; week <= 4; week++) {
                for (int day = 1; day <= 7; day++) {
                    if(week==2 && day==6) {
                        System.out.println("Month" + month + "-" + "week" + week + "-" + "Saturday" +  " " + "Days Completed:" + ++dayscompleted);
                        System.out.println("Come to college" + "Study and go");
                    }
                }
            }
        }
    }
}

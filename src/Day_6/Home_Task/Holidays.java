package Day_6.Home_Task;

public class Holidays {
        public static void main(String[] args) {

            int holidayCount = 0;

            for (int month = 1; month <= 6; month++) {
                System.out.println("Month: " + month);

                for (int week = 1; week <= 4; week++) {
                    for (int day = 1; day <= 7; day++) {
                        if (day == 7) {
                            System.out.println("Week " + week + " - Sunday");
                            holidayCount++;
                        }
                        else if (week == 2 && day == 6) {
                            System.out.println("Week " + week + " - Second Saturday");
                            holidayCount++;
                        }
                    }
                }
                System.out.println();
            }

            System.out.println("Total Holidays = " + holidayCount);
        }
    }

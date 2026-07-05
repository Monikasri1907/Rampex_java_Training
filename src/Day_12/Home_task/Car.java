package Day_12.Home_task;

public class Car {
    void start() {
        System.out.println("Car Started");
    }
}

    class SportsCarmodel extends Car {
        void turbo() {
            System.out.println("Turbo Enabled");
        }
    }

    class Cartest {
        public static void main(String[] args) {
            SportsCarmodel car = new SportsCarmodel();
            car.start();
            car.turbo();
        }
    }
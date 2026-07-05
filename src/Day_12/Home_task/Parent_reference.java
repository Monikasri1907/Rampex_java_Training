package Day_12.Home_task;

public class Parent_reference {
    void start() {
        System.out.println("Car Started");
    }
}
class SportsCarreference extends Car {
    void start() {
        System.out.println("Sports Car Started");
    }
}
class parenttest {
    public static void main(String[] args) {
        Car car = new SportsCarreference();
        car.start();
    }
}
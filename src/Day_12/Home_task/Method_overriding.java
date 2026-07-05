package Day_12.Home_task;

public class Method_overriding {
    void start() {
        System.out.println("Car Started");
    }
}  class SportsCar extends Car {
    void start() {
        System.out.println("Sports Car Started");
    }
}
class Main {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.start();
    }
}

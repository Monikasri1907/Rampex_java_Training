package Day_12.Home_task;

public class Reference {
    void start() {
        System.out.println("Car Started");
    }
}
class SportsCarR extends Car {
    void turbo() {
        System.out.println("Turbo Enabled");
    } }
class MainR {
    public static void main(String[] args) {
        Reference car = new Reference();
        car.start();
    }
}

package Day_12.Home_task;

public class Is_a {
    void start() {
        System.out.println("Engine Started");
    }
}
class CarIs_a {
    Is_a engine = new Is_a();
    void drive() {
        engine.start();
        System.out.println("Driving");
    }
}
class SportsCarisa extends Car {
    void race() {
        System.out.println("Racing");
    }
}
class  IsaMain{
    public static void main(String[] args) {
        SportsCarisa carisa = new SportsCarisa();

        carisa.race();
    }
}


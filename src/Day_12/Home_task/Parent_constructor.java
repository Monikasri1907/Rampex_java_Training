package Day_12.Home_task;

public class Parent_constructor {
    Parent_constructor() {
        System.out.println("Car Ready");
    }
    void display() {
        System.out.println("Normal Car");
    }
}
class SportsCarParent extends Car {
    void display() {
        System.out.println("Sports Car");
    }
}
 class MainP {
    public static void main(String[] args) {
        SportsCarParent car = new SportsCarParent();
        car.display();
    }
}


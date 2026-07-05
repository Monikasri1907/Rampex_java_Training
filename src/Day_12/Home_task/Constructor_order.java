package Day_12.Home_task;

public class Constructor_order {
    Constructor_order() {
        System.out.println("Car Constructor");
    }
}
class SportsCarConstructor extends Car {
    SportsCarConstructor(){
    System.out.println("SportsCar Constructor");
    }
}
class CarConstructortest{
    public static void main(String[] args) {
        SportsCarConstructor car = new SportsCarConstructor();
    }
}

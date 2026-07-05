package Day_12.Home_task;

public class Has_A_relationship {
    Has_A_relationship() {
        System.out.println("Engine Created");
    }
}
class CarHas_A_relationship {
    Has_A_relationship engine = new Has_A_relationship();
    CarHas_A_relationship() {
        System.out.println("Car Created");
    }
}
class Has_A_relationshipMain {
    public static void main(String[] args) {
        Car car = new Car();
    }
}
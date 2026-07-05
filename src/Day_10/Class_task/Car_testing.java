package Day_10.Class_task;

public class Car_testing {
    public static void main(String[] args){
        Car c1=new Car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.colour);
        c1.drive();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();











    }


}
class Car{
    String brand ="BMW";
    String model="M5";
    String colour="Black";
    int speed=0;
    int maximumSpeed=40;
    public void drive(){
        System.out.println("Driving");
    }
    public void accelerate(){
        if(speed<maximumSpeed){
            speed=speed+5;
            System.out.println(brand +"is going at the speed : "+speed);

        }
        else if(speed>=maximumSpeed){
            System.out.println(brand +"is going at the maximum speed,you can not increase the speed" );

        }

    }
    public void brake(){
        if(speed!=0){
            speed=speed-5;
            System.out.println(brand +"is going at the speed : "+speed + "kms");

        }
        else{
            System.out.println("Car is not moving");

        }
    }

}


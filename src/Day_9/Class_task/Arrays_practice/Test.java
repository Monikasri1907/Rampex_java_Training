package Day_9.Class_task.Arrays_practice;

public class Test {
   public static void main(String[] args){
       Car c1=new Car();
       Car c2=new Car();
       System.out.println(c1.brand);
       System.out.println(c1.model);
       System.out.println(c1.colour);
       c1.drive();












   }


}
class Car{
    String brand ="BMW";
    String model="M5";
    String colour="Black";
    public void drive(){
        System.out.println("Driving");
    }


}

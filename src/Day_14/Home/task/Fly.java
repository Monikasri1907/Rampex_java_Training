package Day_14.Home.task;

public class Fly {
    public static void main(String[] args){
        Flyable[] obj = new Flyable[2];

        obj[0] = new Bird();
        obj[1] = new Airplane();

        for (int i = 0; i < obj.length; i++) {
            obj[i].fly();
        }
    }
}
        interface Flyable {
            void fly();
        }

        class Bird implements Flyable {

            public void fly() {
                System.out.println("Bird is flapping wings");
            }
        }

        class Airplane implements Flyable {

            public void fly() {
                System.out.println("Airplane is engaging engines");
            }
        }




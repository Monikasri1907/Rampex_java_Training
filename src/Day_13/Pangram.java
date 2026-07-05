package Day_13;

public class Pangram {
    public static void main(String[] args) {
        String s1 = "good";
        String[] al = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        for (int i = 0; i <= 25; i++) {
            if (s1.contains(al[i]) == false) {
                System.out.println("false");

            }
        }
        System

        }
    }
}

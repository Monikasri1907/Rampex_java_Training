package Day_2;

public class Reverse {
    public static void main(String[] args)
    {
        int num = 123;
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;

        int reverse = c * 100 + b * 10 + a;

        System.out.println("The reverse number is " + reverse);
    }
}

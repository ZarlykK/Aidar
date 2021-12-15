package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        int myNum = 456;
        int dig1 = myNum % 10;
        myNum = myNum /10;

        int dig2 = myNum % 10;
        myNum = myNum /10;
        int dig3 = myNum % 10;
        myNum = myNum /10;
        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
         int multiplication = dig1 * dig2 * dig3;
        System.out.println(multiplication);
    }
}

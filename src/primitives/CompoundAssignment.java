package primitives;

public class CompoundAssignment {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = num1 + 7;
        num1 +=num2;
        System.out.println(num1);

        num2 -= 8;
        System.out.println(num2);

    }
}

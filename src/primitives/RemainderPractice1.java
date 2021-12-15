package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {

        // modules % --- remainder or left over after division

        int num1 = 45;
        int num2 = 6;

        int remainder1 = num1 % num2;

        System.out.println("Remainder1 is "+ remainder1);

        //

        int myNumber = 123;
        int digit3 = myNumber % 10;
        myNumber = myNumber/10;
        int digit2 = myNumber % 10;
        myNumber = myNumber / 10;
        int digit1 = myNumber %10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);

        int sum = digit1 + digit2 + digit3;
        System.out.println("The sum is= "+ sum);

        int numb = 6789;
        int digit4 = numb % 10;
        numb = numb / 10;
        int digit5 = numb % 10;
        numb = numb/ 10;
        int digit6 = numb % 10;
        numb = numb / 10;
        int digit7 = numb % 10;
        numb = numb / 10;
        System.out.println(digit4);
        System.out.println(digit5);
        System.out.println(digit6);
        System.out.println(digit7);
        System.out.println(digit7 + digit6 + digit5 + digit4);

    }
}

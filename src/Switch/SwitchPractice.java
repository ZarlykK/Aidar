package Switch;

public class SwitchPractice {
    public static void main(String[] args) {

        System.out.println("Before Switch");
        int number = 2000;

        switch (number) {

            case 123:
                System.out.println("This is fourth case");
                break;
            case 100: //if the number is 100 meaning
                System.out.println("This is first case");
                break;
            case 110:
                System.out.println("This is second case");
                break;
            case 120:
                System.out.println("this is third case");
                break;
            case 130:
                System.out.println("This is fifth case");
            default://if no matching number default will work
                System.out.println("This is default case");

        }
        System.out.println(("After Switch"));
    }
}

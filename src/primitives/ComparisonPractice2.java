package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {
        // there is an event for kids if a child' height is 48" or more
        // print out the result if kid can attend or not

        double reqHeight = 48;
        double kidHeight = 50;
        boolean canattend = kidHeight >= reqHeight;
        System.out.println(canattend);

        // if the age of child is 6 or less it will be free

        int reqAge = 6;
        int kidAge = 7;

        boolean isFree = kidAge <= reqAge;
        System.out.println("Is the event free for child? "+isFree);


























    }
}

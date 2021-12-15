package Switch;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
     /*
     Ask user his/her favourite fruit
   -you have: mango, banana. kiwi, orange, apple, grape
   if you have users favourite fruit---We have your favourite fruit in our store
   otherwise: Sorry we don't have your favourite fruit.
      */
        Scanner input = new Scanner(System.in);
        System.out.println("What's  your favourite fruit");
        String fruit = input.nextLine().toLowerCase();
        switch (fruit) {
            case "mango":
                System.out.println("We have your favourite fruit in our store");
                break;
            case "banana":
                System.out.println("We have your favourite fruit in our store");
                break;
            case "kiwi":
                System.out.println("We have your favourite fruit in our store");
                break;
            case "orange":
                System.out.println("We have your favourite fruit in our store");
                break;
            case "apple":
                System.out.println("We have your favourite fruit in our store");
                break;
            case "grape":
                System.out.println("We have your favourite fruit in our store");
                break;
            default:
                System.out.println("Sorry we don't have your favourite fruit");
                break;
        }

    }
}

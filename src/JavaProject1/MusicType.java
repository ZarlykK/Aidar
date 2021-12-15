package JavaProject1;

import java.util.Scanner;

public class MusicType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = 0;
        int expectedSongPrice = 10;

        do {
            if (price == 0) {
                System.out.println("enter the amount");
            } else {
                System.out.println("You need to add " + (expectedSongPrice - price));
                System.out.println("please enter the amount you want to add");
            }
            price += scanner.nextInt();
            if (price < 0) {
                System.out.println("Your price is not acceptable");
                price = 0;
                continue;
            }
        } while (price < expectedSongPrice);
        if (price > expectedSongPrice) {
            System.out.println("Your $" + (price - expectedSongPrice) + " exhchange is getting ready");
            System.out.println("Have a good day");
        } else {
            System.out.println("Have a good day");
        }
    }


}
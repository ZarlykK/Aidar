package Loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailPractice {
    public static void main(String[] args) {
        /*
        I want to create a head/tail game with java codes
        -At the beginning print "Game is started, Make a guess!! Head/Tail "So, let the user know
        that the game is started
        --Get user's guess as Head/Tail
        -compare user's guess with your random number 0/1---> random.nextInt(2)
        -if guess is correct, print --->>>"You are lucky, Its your day today."
        -if the guess is incorrect, print "Sorry, that was not the correct choice!"
        -at the end, ask user "Do you want to play again? Y/N"
        -If the answer is Y >>> keep playing (this is your while condition)
        -if the answer is N >>> print >> "It's ok, see you next time!"
         */



        Scanner scanner=new Scanner(System.in); //to get number from user
        Random input=new Random();//random number to get a random number
        String answer;
//        System.out.println("Game is started, Make a guess!! Head/Tail "); if you put here it only ask once
       do{
            System.out.println("Game is started, Make a guess!! Head/Tail ");
            String guess = scanner.next();
            int number=input.nextInt(2);

            String flip = number==0? "Head": "Tail";
            if(guess.equalsIgnoreCase(flip)) {
                System.out.println("You are lucky, Its your day today.");
            }else{
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again? Y/N ");
            answer = scanner.next();//if the answer yes it will go back and run again
        }while(answer.equalsIgnoreCase("y"));
        System.out.println("It's ok see you next time");
    }

}

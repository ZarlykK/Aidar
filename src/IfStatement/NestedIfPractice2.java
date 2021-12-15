package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        //city--chicago
        //course--techtorial
        //batch--11
        Scanner input=new Scanner(System.in);
        System.out.println("What city you live in? ");
        String city=input.nextLine();
        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("Which course are you attending? ");
            if(input.nextLine().equalsIgnoreCase("techtorial")){
                System.out.println("Provide your batch? ");
                if(input.nextLine().equalsIgnoreCase("11")){
                    System.out.println("Welcome to batch 11");

                }else{
                    System.out.println("Register for batch 11");
                }
            }else{
                System.out.println("Come to techtorial");
            }
        }else{
            System.out.println("Come to Chicago");
        }
    }

}

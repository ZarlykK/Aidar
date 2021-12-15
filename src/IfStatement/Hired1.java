package IfStatement;

import java.util.Scanner;

public class Hired1 {
    public static void main(String[] args) {
        /*
        nested if >>java>>selenium>>api>>sql
        ask user:
        he knows java yes/no
           selenium yes/no
         can learn: asd has api testing experience
         yes: ask api testing experience
         no:we need someone who is familiar with selenium
         yes: we need someone who is familiar with selenium
         yes: ask has sql knowledge
         no:we need someone who has sql knowledge
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have Java experience? yes/no ");
        String java=scanner.nextLine();
        if(java.equalsIgnoreCase("yes")){
            System.out.println("Do you have Selenium experience? yes / no / learn ");
            String selenium=scanner.nextLine();
            if(selenium.equalsIgnoreCase("yes") ){
                System.out.println("Do you have API testing experience? ");
                String api=scanner.nextLine();
                if(api.equalsIgnoreCase("yes")){
                    System.out.println("Do you have SQL knowledge? ");
                    String sql=scanner.nextLine();
                    if(api.equalsIgnoreCase("yes")){
                        System.out.println("Congrats, you are hired");

                    }else{
                        System.out.println("We need someone SQL");
                    }
                }else{
                    System.out.println("We need someone API");
                }

                }else if(selenium.equalsIgnoreCase("learn")){
            }
            else{
                System.out.println("We need someone Selenium");
            }
        }else{
            System.out.println("We should learn programming language");
        }
    }
}




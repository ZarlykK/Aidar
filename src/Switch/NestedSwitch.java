package Switch;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        /*
        1- IT department
           David, Tima
        2- Admin
           Alex, Jessi
        3- Customer Care
           Zack, Ana, John
           "Who do you want to speak with? Please enter name: David, Tima"
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Techtorial! Which department do you want to connect? " +
                "please select from following options1 \n1- IT Department \n2- Admin \n3- Customer Care");
        int dept= scanner.nextInt();
        switch(dept){
            case 1:
                System.out.println("You are in IT department, Who do you want to speak with?" +
                        " Please enter name: David, Tima");
                scanner=new Scanner(System.in);
                String name= scanner.nextLine().toLowerCase();
                switch(name){
                    case  "david":
                        System.out.println("Hello This is David");
                        //want to differ morning and afternoon
                        int hour= LocalDateTime.now().getHour();
                        if(hour>8 && hour<12){
                            System.out.println("I am still in the office");
                        }else if(hour>12 && hour <17){
                        }else{
                            System.out.println("this is not a good time");
                        }
                        System.out.println(hour);
                        break;
                    case "tima":
                        System.out.println("Hello This is Tima");
                        break;
                    default:
                        System.out.println("We don't have "+name.toUpperCase());
                        break;
                }
                break; // this is for case 1
            case 2:
                System.out.println("You are in Admin, Who do you want to speak with?" +
                        " Please enter name: Alex, Jessi");
                String name1= scanner.nextLine().toLowerCase();
                switch(name1){
                    case "alex":
                        System.out.println("Hello This is alex");
                        break;
                    case "jessi":
                        System.out.println("Hello This is jessi");
                        break;
                    default:
                        System.out.println("We don't have "+name1.toUpperCase());
                        break;
                }
                break;
            case 3:
                System.out.println("You are in Customer Care, Who do you want to speak with?" +
                        " Please enter name: Ana, John");
                scanner=new Scanner(System.in);
                String name3= scanner.nextLine().toLowerCase();
                switch(name3){
                    case "ana":
                        System.out.println("Hello This is ana");
                        break;
                    case "john":
                        System.out.println("Hello This is john");
                        break;
                    default:
                        System.out.println("We don't have "+name3.toUpperCase());
                        break;
                }
                break;
            default:
                System.out.println("Your selection is not valid");
        }

    }
}

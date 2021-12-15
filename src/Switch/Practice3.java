package Switch;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user name of the geometrical shape
        based on the name of the shape
        calculate the area of that shape
        get length and width for rectangle
        get height and base for for triangle from  user to use them in calculations
        print out name of the shape and area of that shape
        -triangle, rectangle
        rectangle = l* w     triangle = (base*height)/2
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Which shape you want to calculate area of? Triangle / Rectangle");
        String shape=input.nextLine().toLowerCase();

        switch(shape){
            case "triangle":
                System.out.println("Please enter height of the triangle");
                double height=input.nextDouble();
                System.out.println("Please enter base of triangle");
                double base=input.nextDouble();
                System.out.println("The area of triangle is: "+((base*height)/2));
                break;
            case "rectangle":
                System.out.println("Please enter length of rectangle");
                double l=input.nextDouble();
                System.out.println("Please enter width of rectangle");
                double w= input.nextDouble();
                System.out.println("The area of rectangle is: "+l*w);
                break;
            default:
                System.out.println("your shape selection is out of my calculation");
                break;
        }

        }



    }


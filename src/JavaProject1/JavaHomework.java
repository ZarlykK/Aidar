package JavaProject1;

import java.util.Scanner;

public class JavaHomework {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a String value");
                String str=input.next();

                if(str.length()>=3){
                    System.out.println(str.substring(1, 3));
    }
        System.out.println("Please enter an integer");
                int a= input.nextInt();
                if(a>=0){
                    System.out.println("positive");
                }else{
                    System.out.println("negative");
                }
}
}

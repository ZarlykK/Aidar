package IfStatement;

public class Practice2 {
    public static void main(String[] args) {
        int age=12;
        double money=200;

        if (age>=18){
            System.out.println("You can go to picnic");
        }
        if (money>=100){
            System.out.println("You can go to picnic with this amount: "+money);
        }
        //combine these two conditions top create an if statement which will accept either
        //print you are ok with one of the requirement
        if(age>=18 || money>=100){
            System.out.println("You are ok with one of the requirements");
        }
    }
}

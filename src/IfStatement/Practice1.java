package IfStatement;

public class Practice1 {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int c=10;

        if (a==b){
            System.out.println("You can go to picnic");

        }
        if (a==c){

            System.out.println("This is the second option for picnic");
        }
        if(a==b || a!=c){

            System.out.println("Yaayy, I am going");
        }
        System.out.println("I will be happy");
    }
}

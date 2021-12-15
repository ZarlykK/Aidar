package IfStatement;

public class CurlyBracketPractice0 {
    public static void main(String[] args) {
//        int number = 1234;
//        if (number == 1234)//if this is true or not it will only affect first line
//            System.out.println("Number is equals to 1234");
//        System.out.println("Number is not equals to 1234");
//        // if no curly braces it only effects only following line
//        //with curly braces it effects whole block inside the brace
//        //if its true it will print out whole if false NOTHING will be printed out
//        if (number == 5)
//            System.out.println("Hello World");
//        System.out.println(("hello JAVA"));
//        System.out.println("hello Selenium");
//        System.out.println("Hello Alex");
//        System.out.println("Hell ALL");

        int num1 = 6;
        if (num1 < 10)
            num1++;
        System.out.println(num1);

        int num2 = 4;
        if (num2 > 20)
            num2++;//if its false second line increment will not work
        // it will only print out integer without incrementing
        System.out.println(num2);

        int a =9;
        if(1==2) // since its false it will effect foloowing line and 32 will not work
            a=2+2;
        System.out.println("======");
        System.out.println("a");
    }
}

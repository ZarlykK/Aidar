package primitives;

public class UnaryPractice {
    public static void main(String[] args) {
        int studentNumber = 25;
        System.out.println(studentNumber);

        int num1 = studentNumber++;

        System.out.println(num1);

        int n = 10;
        System.out.println(n++);
        System.out.println(n);
        n++;
        System.out.println(n);
        int number = 8;
        System.out.println(number--);
        System.out.println(number--);
        System.out.println(--number);
        number++;
        System.out.println(number++ + number++);
        System.out.println(number);
        int result = --number + -- number + 2 - number++ * 2;

        char ch = 'a';
        System.out.println(ch);
        System.out.println(++ch);
        ch++;
        ++ch;
        System.out.println(ch);

/////////////////////////////////////
        int donutNumber = 12;
        int eachDonut= 2;
        int total = donutNumber * eachDonut;
        System.out.println(total);
        System.out.println(--total);

}
}
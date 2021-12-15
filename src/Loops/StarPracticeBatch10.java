package Loops;

public class StarPracticeBatch10 {
    public static void main(String[] args) {
        /*
        5 --
        *
        **
        ***
        ****
        *****
         */
        int a = 0;
        String star="*";
        while(a<5){

            System.out.println(star);
            star += "*";

            a++;
        }

    }
}

package primitives;

public class NumericPromotion {
    public static void main(String[] args) {
        byte n = 1;
       short n2 = n;

       short sh = 3;
      // byte b2 = sh; // you can not put larger data to smaller data type

       int total = n + n2; // Java always sees everything integer if they are whole numbers

       byte b2 = 2;
       int total2 = n+b2;

       int i = 4;
       double d1 = 6;
       double sum = i + d1; //You can not put integer into double so you have to put to larger double data type.

        float f1 = 1.2f;
        float f2 = 3.4f;
        float sum3 = f1 + f2;

        int sum4 = n + n2;


    }
}

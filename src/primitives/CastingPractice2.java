package primitives;

public class CastingPractice2 {
    public static void main(String[] args) {
        double number = 3.45;
        float fl1 = (float) number;
        long l1 = (long)fl1;
        int i1 = (int) l1;
        short sh1 = (short) i1;
        byte b1= (byte) sh1;
        System.out.println(b1);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    int count = 129;
    short sh2 = (short) count;


}
}
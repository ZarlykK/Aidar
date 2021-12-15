package primitives;

public class IncrementDecrement {
    public static void main(String[] args) {
        int k=2;
        k++;
        int L=k++ +2+ ++k-3*--k;
        System.out.println(L);

        int a=1;
        int b=2;
        int c;
        int d;
        c=++b;
        d=a++;
        c++;
        b++;
        ++a;
        System.out.println(a + " " + b + " " + c);
    }
}

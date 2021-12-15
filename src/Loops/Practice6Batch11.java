package Loops;

public class Practice6Batch11 {
    public static void main(String[] args) {
       /*
       Summer ---- print out every single letter from this word one by one
       S,u,m,m,m,e,r,
        */
        String text = "Summer";
        int index=0;

        while(index<text.length()){
            System.out.print(text.charAt(index)+", ");//sout print only(not println) prints in the same line
            index++;
        }


        //System.out.println(text.charAt(0));
       // System.out.println(text.charAt(1));
       // System.out.println(text.charAt(2));
       // System.out.println(text.charAt(3));
       // System.out.println(text.charAt(4));
       // System.out.println(text.charAt(5));

    }
}

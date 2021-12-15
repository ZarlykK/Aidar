package Loops;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

public class ForLoop2Batch10 {
    public static void main(String[] args) {
        /*
        Print out letters from given String value
        chicago
         */
        String word="chicago";


        for(int index=0;index<word.length();index++ ){
            System.out.println(word.charAt(index));
            }

        for(int index = word.length()-1; index>=0;index--){
            System.out.println(word.charAt(index));
        }
        //printout only letter 'o' from this String
        String string = "Today is the day to practice for loop";
int count=0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='o'){
                System.out.println(string.charAt(i));
                count++;//we use == to compare single char
                System.out.println("the index number of "+count+". 'o' is "+i);
            }
            //System.out.println(count); it will show everything because it is inside of the loop
        }
        System.out.println("count is "+count);
    }

    //"the index number of o is"...(show index number of each letter 'o')

}

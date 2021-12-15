package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            System.out.println("======");
            if(i<7){
                continue;}//closest loop

            for(int k=0; k<10; k++){

//                continue; if we put here we will continue previous and stop next it shouldn't be here


//                continue; no change if we put here
                if(k>5) {
                    continue;} //if k more than 5 skip means                if (i==11) {
                if(i>11) {
                    break;//it will break closest loop
                }
                System.out.println("i ---> "+i);
                System.out.println("k-->>> "+k);
                }
            }
        }
    }


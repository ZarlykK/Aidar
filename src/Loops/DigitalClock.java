package Loops;

public class DigitalClock {

    public static void main(String[] args) {

    label://you can give any name
    for(int hour=0; hour<12;hour++){

        inner:
        for(int m=0; m<=59;m++){
            if(m>=10 && m<=12) {//wanted to stop when minutes are 29 mins by putting break right after
//               break //break will affect just above loop when reaches to 30 it will stop outer hour
               //break will affect just above loop when reaches to 30 it will stop outer hour
                continue; //break will stop continue will continue, it will skip whatever vaue you give
                // and will continue from 12 since it was m>=10 && m<=12(skip 10,11,12)
            }
            for(int sec=0; sec<=59;sec++){
                System.out.println(hour+" : "+m+" : "+sec);
                if(sec==10){
                    break label ;//it will stop label(hour) also sec hits 59
                }

            }

        }


    }

    }
    }

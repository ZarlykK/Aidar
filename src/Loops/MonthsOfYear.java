package Loops;

import Switch.SwitchPractice;

public class MonthsOfYear {
    public static void main(String[] args) {
        /*
        print out months of the year between 2020 to 2023
         */


        for(int year=2020;year<=2023;year++){

            System.out.print(year+" ---> ");
            System.out.println();

            for(int month=1;month<=12;month++){

                System.out.print(month + " ");
                switch(month) {
                    case 1:
                        System.out.println("Jan");
                        for(int m=1; m <= 31; m++){
                            System.out.println(m +" ");
                        }
                        break;
                    case 2:
                        System.out.println("Feb");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("Sept");
                        break;
                    case 10:
                        System.out.println("Oct");
                        break;
                    case 11:
                        System.out.println("Nov");
                        break;
                    case 12:
                        System.out.println("Dec");
                        break;

                }

            }
//            System.out.println();





        }
        System.out.println();
    }

}

package primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        // there is an event for kids
        // if the age of child is 6 or less or if the height of child is 48 inches or less
        // the event is free for that child

        int ageReq = 6;
        int reqHeight = 48;

        int kidAge = 7;
        int kidHeight = 47;

        boolean isFree = kidAge<=ageReq || kidHeight <= reqHeight;
        boolean isFree1 = kidAge >= ageReq || reqHeight >= kidHeight;
        System.out.println(isFree);
        System.out.println(isFree1);

        // find out if student can pass a class
        // there are 3 tests taken -- 60, 100, 85
        // average of those test has to be 70 or more
        // attendance rate of the student has to be 80 or more
        // print out if student can pass the class or not
        int test1 = 60, test2 = 100, test3 = 85;
        int reqAverage = 70;
        int attendReq = 80;
        int studentAttendance = 85;
        int average =(test1 + test2+test3)/3;
        boolean passClass = average>=reqAverage && studentAttendance >= ageReq;
        System.out.println(passClass);
}
}
package primitives;

public class truthTable1 {
    public static void main(String[] args) {
        // visa and ticket (requirements)

        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myticket = true;
        boolean canTravel = visa == myVisa && ticket == myticket;

        System.out.println(canTravel);

        // ask question
        boolean online = true;
        boolean campus = true;

        boolean student = false;
        boolean askQuestion = student == online || student == campus;
        System.out.println("Can I ask question? "+ askQuestion);

        // attendance 90%, score 80%
        int regAttendance = 90;
        int reqScore = 80;
        int yourAttendance = 100;
        int yourScore = 90;
        boolean pass = yourAttendance >= regAttendance && yourScore >= reqScore;
        System.out.println(pass);
}
}


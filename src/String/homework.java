package String;

public class homework {
    public static void main(String[] args) {
        int minutes = 3456789;
        int minutesInADay = 60*24;
        int minutesInAYear = 60*24*365;
        int year = minutes/minutesInAYear;
        int leftAfterYear=minutes%minutesInAYear;
        int days=leftAfterYear%minutesInADay;
        System.out.println(minutes + " minutes is "+year+" years and "+days+ " days" );
    }
}

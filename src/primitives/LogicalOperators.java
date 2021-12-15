package primitives;

public class LogicalOperators {
    public static void main(String[] args) {
        // if you attend 95 % or more of the classes or more than 70% of passing
        int attendance = 95;
        int scoreReq = 70;

        int myAttend = 10;
        int myScore = 65;

        boolean pass = myAttend >= attendance || myScore > scoreReq;
        System.out.println("Am I passing "+ pass);
}

}

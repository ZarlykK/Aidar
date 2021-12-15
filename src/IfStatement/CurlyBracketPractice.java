package IfStatement;

public class CurlyBracketPractice {
    public static void main(String[] args) {
        int appleNumber = 40;
        int orangeNumber=30;

        if(appleNumber<orangeNumber){//with bracket if the condition is false it won't print
            appleNumber++;
            System.out.println("There are more apple in the store than oranges "+appleNumber);

        }
        if(orangeNumber>appleNumber)
            orangeNumber++;//no bracket only this line will be effected
            ++orangeNumber;//this second line will work
            System.out.println("There are more oranges than apple in the store " + orangeNumber);

    }

}

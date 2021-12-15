package String;

public class methods4 {
    public static void main(String[] args) {
        String a = "John";
        String b = "John";

        boolean bl1 = a.equals(b); // true
        System.out.println(bl1);
        boolean bl2 = a.equals("John");//true
        System.out.println(bl2);
        String c = "JOHN";
        boolean bl3 = a.equals(c); //false
        System.out.println(bl3);
        boolean bl4 = a.equalsIgnoreCase(c);
        System.out.println(bl4);

        System.out.println("Java is".equalsIgnoreCase("Java is"));
        System.out.println("Java is".equalsIgnoreCase("JAVA NOT"));
String str1 = "Java is cool";
        str1 = str1.replace('o', '$');
        System.out.println(str1);

        str1 = str1.replace("c$$l", "easy");
        System.out.println(str1);
         //////////////////////////TRIM method////
        String text2 = " It is Saturday ";
        System.out.println(text2.trim()); //// text2= text.trim();

        /////////"Do whatever it takes"
        ////////concat with "to learn Java"
        ///////make everything to uppercase
        //////replace "Java" with "JOB"
        /////check if the text contains "Chicago"
        String str="Do whatever it takes";
         str= str.concat(" to learn Java");
        str = str.toUpperCase();
        str = str.replace("JAVA", "JOB");
        System.out.println("Does it contain Chicago"+ (str.contains("Chicago")));
        System.out.println(str);
}
}


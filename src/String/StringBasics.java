package String;

public class StringBasics {
    public static void main(String[] args) {
        String text = "School";
        String name = new String("David");
        System.out.println(text);
        System.out.println(name);

        text = text + " is a Tectorial";
        System.out.println(text);

        String word = name + text;
        System.out.println(word);
        System.out.println(word + "5");
        System.out.println(word);

        String str = "Java";
        String str3 = new String("Java"); /// saved in different place than above
        String str1 = "Selenium";
        String result = str + " "+ str1;
        System.out.println(result);
        System.out.println(str1+" is next");
        System.out.println(result + str+ str1);

        String word6 = "tech";
        System.out.println(word + 7*8);

        word6+= "torial";
        System.out.println(word6);

        word6+=33;
        System.out.println(word6);
        word6 += 33 - 11;
        System.out.println(word6);






    }
}

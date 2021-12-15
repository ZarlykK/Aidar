package String;

public class methods1 {
    public static void main(String[] args) {

        String city = "Chicago";
        city.concat(" is very cold");
        System.out.println(city);

        String newCity = city.concat(" is very beautiful");
        System.out.println(city);
        System.out.println(newCity);

        System.out.println(newCity.length());
        int letterCount = newCity.length();
        System.out.println(letterCount);

         city.charAt(1);
        city.charAt(0);
        System.out.println( city.charAt(0));
        city.charAt(2);
        System.out.println("It is almost time to go home");

        //char lastChar= example.charAt(example.length()-1); -1 show last character
        String example = "Chicago is a good city but very cold";
        //
        int count = example.length();
        char lastLetter=example.charAt(count-1);
        ////System.out.println(example.charAt(example.length()-1));
        System.out.println(lastLetter);

        String school="Techtorial";
        //find the middle char
        System.out.println(school.charAt(school.length()-1/2));

    }
}

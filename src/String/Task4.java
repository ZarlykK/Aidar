package String;

public class Task4 {
    public static void main(String[] args) {
        String str = " Zero to Ten ";
        String change=str.replace("Ten", "HERO");
        String make=str.toUpperCase();
        String remove=str.trim();
        remove=str.replace(" ", "");
        System.out.println(remove);
        String get=str.substring(0,3);
        System.out.println(change);
        System.out.println(make);
        System.out.println(remove);
        System.out.println(get);
        System.out.println("The length of final version is "+ remove.length());

        //method chaining ===> you can use method after method
        String str2 = " Zero to Ten  ";
        System.out.println(str2.replace("Ten", "HERO").toUpperCase().trim()
                .replace(" ", "").substring(0,3).length());
        // int a=str.replace("Ten", "HERO").toUpperCase().
        // trim().replace(" ", "").substring(0,3).length(); - because the last one is length it requires number,
                                                             // so you can store it into integer

    }
}

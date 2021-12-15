package String;

public class MethodChaining0 {
    public static void main(String[] args) {
        String name = "David";
       char letter= name.substring(3).substring(0).toUpperCase()
               .replace("A", "xxx").trim().charAt(1);//since its ending
        // with char we are storing into char
        System.out.println(letter);
        System.out.println(name);
        int index=name.indexOf("R");
        System.out.println(index);

        //String n = name.substring(5).substring(2).toUpperCase()
                //.replace("A", "xxx").trim();

    }
}

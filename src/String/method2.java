package String;

public class method2 {
    public static void main(String[] args) {
        String name = "Diana";

        System.out. println( name.indexOf('D'));
        System.out.println(name.indexOf("D"));
        System.out.println(name.indexOf("Di"));
        System.out.println(name.indexOf("ana"));
        System.out.println(name.indexOf("anan")); // -1 there is no matching char
        System.out.println(name.indexOf("ina")); // -1 there is no matching char
        System.out.println(name.indexOf("z"));  // -1 there is no matching char

        System.out.println("this is saturday morning");
        name = name.concat(" Bejan");
        System.out.println(name); // Diana Bejan
        ; // -->
        System.out.println(name.indexOf('a', 3)); // it will start looking for
                                                    // that char starting from given index
        System.out.println(name.indexOf("a", name.indexOf(" ")));
        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("e", name.indexOf(" ")+3));

        String object = "umbrellam";
        System.out.println(object.indexOf('l'));
        System.out.println(object.indexOf('l', 6));
        System.out.println(object.indexOf('m', object.indexOf('m')+1));
        System.out.println(object.length());
        System.out.println(object.indexOf('m',object.indexOf('a')));

        /////making single letter upper case
        String str="Just do it";
        char letter=str.charAt(str.indexOf('d'));
        String str2 = "";
        str2+=letter;

        System.out.println(str2.toUpperCase());






    }
}

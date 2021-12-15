package String;

public class Methods5 {
    public static void main(String[] args) {
        String name = "   Techtorial Academy is located in Des Plaines  ";
        //trim method it will remove spaces before and after spaces
        System.out.println(name);
        System.out.println(name.trim());
        String part1 = name.substring(4);
        System.out.println(part1);
        String part2=part1.substring(4,11);
        System.out.println(part2);
    }
}

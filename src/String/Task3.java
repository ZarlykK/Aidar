package String;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide your gender, full name and birth year in"
                + "the following format: F - Jenny Brown - 1999");
        String info = scanner.nextLine();
        System.out.println(info.startsWith("F"));
        System.out.println(info.endsWith("M"));
        System.out.println(info.contains("Zarlyk"));
        System.out.println(info.endsWith("1988"));
        System.out.println(info.replace('-', '/'));


    }
}

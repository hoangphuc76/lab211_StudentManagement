package Common;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputter {
    public String getSemester(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (true) {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
            if (!s.isEmpty() && new Validation().isSemester(s))
                return s;
        }
    }
    public String getName(String name) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = null;
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
            sb = new StringBuilder(s);
            if (Character.isLowerCase(sb.charAt(0))) {
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            }
        }
        return sb.toString();
    }

    public String getString(String name) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        while (s == null || s.isEmpty()) {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
        }
        return s;
    }

    public String inputPatter(String name, String pattern) {
        Scanner sc = new Scanner(System.in);
        String s = null;
        do {
            System.out.print(String.format("Enter %s: ", name));
            s = sc.nextLine();
        } while (s == null || s.isEmpty() || !s.matches(pattern));
        return s;
    }

}

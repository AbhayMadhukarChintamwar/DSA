import java.util.Scanner;

public class CheckAB {
    public static boolean checkAB(String s) {
        boolean b = true;
        if (s.charAt(0) != 'a') {
            b = false;

        } else {
            b = check(s);
        }
        return b;
    }

    public static boolean check(String s) {
        if (s.length() == 0) {
            return true;
        }
        boolean b = false;
        if (s.charAt(0) == 'a') {
            if (s.length() == 1) {
                return true;
            } else if (s.charAt(1) == 'a') {
                b = check(s.substring(1));

            } else if (s.length() >= 3 && s.substring(1, 3).equals("bb")) {
                b = check(s.substring(2));

            } else {
                return false;
            }
        } else if (s.charAt(0) == 'b') {
            if (s.length() == 1) {
                return true;

            } else if (s.charAt(1) == 'a') {
                b = check(s.substring(1));

            } else {
                return false;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(checkAB(s));
    }
}

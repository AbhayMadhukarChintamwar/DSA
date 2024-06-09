import java.util.Scanner;

public class StringToInteger {
    public static int stringToInteger(String s) {

        if (s.length() < 1) {
            return 0;
        }

        int integers = s.charAt(s.length() - 1) - '0' + (10 * stringToInteger(s.substring(0, s.length() - 1)));
        return integers;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(stringToInteger(s));
    }
}

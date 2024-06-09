import java.util.Scanner;

public class RecursivePolindrome {
    public static boolean polindrome(String s, int si, int ei) {
        if (si == ei) {
            return true;
        }

        if (s.charAt(si) == s.charAt(ei)) {
            si = si + 1;
            ei = ei - 1;
            if (si > ei) {
                return true;
            }
            boolean small_output = polindrome(s, si, ei);
            return small_output;
        } else {
            return false;
        }

    }

    public static boolean isPolindrome(String s) {

        boolean a = polindrome(s, 0, s.length() - 1);
        return a;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(isPolindrome(s));
    }
}

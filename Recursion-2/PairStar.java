import java.util.Scanner;

public class PairStar {
    public static String paiStrings(String s) {
        if (s.length() < 2) {
            return s;
        }

        String addStar = s.substring(0, 1);
        if (s.charAt(0) == s.charAt(1)) {
            addStar = addStar + "*";
        }

        return addStar + paiStrings(s.substring(1));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(paiStrings(s));
    }
}

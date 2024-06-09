public class RecursionString {
    public static String replaceChar(String s, char a, char b) {
        if (s.length() == 0) {
            return s;
        }

        String smallOutPut = replaceChar(s.substring(1), a, b);
        if (s.charAt(0) == a) {
            return b + smallOutPut;
        } else {
            return s.charAt(0) + smallOutPut;
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("abcarsd", 'a', 'b'));
    }
}
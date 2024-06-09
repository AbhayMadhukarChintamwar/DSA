public class ReplacePi {
    public static String replacePi(String a) {
        if (a.length() <= 1) {
            return a;
        }

        if (a.charAt(0) == 'p' && a.charAt(1) == 'i') {
            String smallOutput = replacePi(a.substring(2));
            return "3.14" + smallOutput;

        } else {
            String smallOutput = replacePi(a.substring(1));
            return a.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        System.out.println(replacePi("apipiippipi"));
    }
}

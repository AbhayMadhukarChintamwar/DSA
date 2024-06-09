import java.util.Scanner;

public class MultiplicationRecursive {
    public static int multiplicationRecursive(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        int small_output = multiplicationRecursive(m, n - 1);
        int output = m + small_output;
        return output;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        System.out.println(multiplicationRecursive(m, n));
    }
}

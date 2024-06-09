import java.util.Scanner;

public class CountZero {
    public static int countZero(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 10) {
            return 0;
        } else if (n % 10 == 0) {
            

            return 1 + countZero(n / 10);
        }
        return countZero(n / 10);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(countZero(n));
    }
}

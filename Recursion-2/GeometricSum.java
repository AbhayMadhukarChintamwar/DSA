import java.util.Scanner;

public class GeometricSum {
    public static double findGeometricSum(int n) {
        if (n == 0) {
            return 1;
        }

        double GeoSum = (1 / (Math.pow(2, n))) + findGeometricSum(n - 1);
        return GeoSum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(findGeometricSum(n));
    }
}

import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerOfHanoi(int disk, char source, char auxilarity, char destination){
        if (disk ==0) {
            return;
        }

        if (disk == 1) {
            System.out.println(source + " " + destination);
        } else {
            towerOfHanoi(disk-1, source, destination, auxilarity);
            System.out.println(source + " "+ destination);
            towerOfHanoi(disk-1, auxilarity,source,  destination);
        }
    }
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int disk = s.nextInt();
        towerOfHanoi(disk, 'A', 'B', 'C');
    }
}

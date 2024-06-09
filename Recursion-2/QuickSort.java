public class QuickSort {

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }

        int pivotPas = partition(a, s, e);
        quickSort(a, s, pivotPas - 1);
        quickSort(a, pivotPas + 1, e);
    }

    public static int partition(int a[], int s, int e) {
        int pivot = a[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (a[i] <= pivot) {
                count++;
            }
        }

        int pivotPas = s + count;
        int temp = a[pivotPas];
        a[pivotPas] = a[s];
        a[s] = temp;

        int i = s, j = e;
        while (i < pivotPas && j > pivotPas) {
            if (a[i] <= pivot) {

                i++;
            } else if (a[j] > pivot) {
                j--;
            } else {
                int temp2 = a[i];
                a[i] = a[j];
                a[j] = temp2;
                i++;
                j--;
            }
        }
        return pivotPas;
    }

    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 4, 3, 3, 7, 8, 5 };
        quickSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
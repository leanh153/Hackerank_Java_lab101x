import java.util.Scanner;

public class _28Java1DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        // Prints each sequential element in array a
        for (int anA : a) {
            System.out.println(anA);
        }
    }
}



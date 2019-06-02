import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _29Java2dArray {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        List<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int val = add(arr[i][j], arr[i][j + 1], arr[i][j + 2], arr[i + 1][j + 1], arr[i + 2][j], arr[i + 2][j + 1], arr[i + 2][j + 2]);
                arr1.add(val);
            }
        }
        int max = arr1.get(0);
        for (int i = 0; i < arr1.size() - 1; i++) {
            if (max < arr1.get(i + 1)) {
                max = arr1.get(i + 1);
            }
        }

        System.out.println(max);
        scanner.close();
    }

    private static int add(int a, int b, int c, int d, int e, int f, int h) {
        return a + b + c + d + e + f + h;
    }
}


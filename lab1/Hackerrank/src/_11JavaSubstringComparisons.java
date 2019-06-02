import java.util.Scanner;

public class _11JavaSubstringComparisons {
    private static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int longLimit = k;
        for (int i = 0; i < (s.length() - k) + 1; i++) {
            String subString = s.substring(i, longLimit);
            if (i < 1) {
                largest = subString;
                smallest = subString;
            } else {
                if (largest.compareTo(subString) < 0) {
                    largest = subString;
                }
                if (smallest.compareTo(subString) > 0) {
                    smallest = subString;
                }
            }
            longLimit += 1;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}


import java.util.Scanner;

public class _13JavaAnagrams {

    private static boolean isAnagram(String a, String b) {
        String[] aArray = a.split("");
        String[] bArray = b.split("");
        int lastIndex = aArray.length;
        if (aArray.length != bArray.length) {
            return false;
        }
        sortArray(aArray, lastIndex);
        sortArray(bArray, lastIndex);
        for (int i = 0; i < lastIndex; i++) {
            if (aArray[i].compareToIgnoreCase(bArray[i]) != 0) {
                return false;
            }
        }
        return true;
    }
    // this method sort element in the array
    private static void sortArray(String[] array, int high) {
        for (int j = 0; j < high; j++) {
            for (int k = j; k < high; k++) {
                if (array[j].compareToIgnoreCase(array[k]) > 0) {
                    swap(array, j, k);
                }
            }
        }

    }

    private static void swap(String[] array, int j, int k) {
        String temp = array[j];
        array[j] = array[k];
        array[k] = temp;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}




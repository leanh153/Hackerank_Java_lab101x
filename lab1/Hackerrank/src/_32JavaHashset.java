import java.util.Scanner;

public class _32JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        //Write your code here
        // this class is working well, but while running on the web
        // may be get this error "Terminate due to time out"
        int count = 1;
        System.out.println(count);
        for (int i = 1; i < t; i++) {
            boolean contain = false;
            for (int j = i - 1; j >= 0; j--) {
                if (pair_left[i].equals(pair_left[j]) && pair_right[i].equals(pair_right[j])) {
                    contain = true;
                }
            }
            if (!contain) {
                count++;
                System.out.println(count);
            } else {
                System.out.println(count);
            }
        }
    }
}

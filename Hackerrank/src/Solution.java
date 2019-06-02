import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            List<Integer> lst = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                lst.add(a+(int)Math.pow(2, i)+b);
            }
            lst.forEach(System.out::print);
        }
        in.close();
    }
}

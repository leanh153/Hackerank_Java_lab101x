import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _30JavaSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in=scan.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < in; i++) {
            int input = scan.nextInt();
            array.add(input);
        }
        int count=0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size()+1; j++) {
                List<Integer> sub= array.subList(i, j);
                int total=0;
                for (Integer aSub : sub) {
                    total += aSub;
                }
                if (total < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
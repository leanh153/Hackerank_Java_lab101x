import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _31ArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        List<List<Integer>> list = new ArrayList<>();
        inputScan(list, in);
        List<List<Integer>> list1 = new ArrayList<>();
        int n1= inputScan(list1, in);
        for (int i = 0; i < n1; i++) {
            try {
                int row = list1.get(i).get(0);
                int col = list1.get(i).get(1);
                System.out.println(list.get(row - 1).get(col));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }

    private static int inputScan(List<List<Integer>> list, BufferedReader in) throws IOException{
        String s;
        int n = 0;
        if (((s = in.readLine()) != null)) {
            n = Integer.parseInt(s);
        }
        String s1;
        for (int i = 0; i < n; i++) {
            if ((s1 = in.readLine()) != null) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                String[] strings = s1.split(" ");
                for (String string : strings) {
                    arrayList.add(Integer.parseInt(string));
                }
                list.add(arrayList);
            }
        }
        return n;
    }
}
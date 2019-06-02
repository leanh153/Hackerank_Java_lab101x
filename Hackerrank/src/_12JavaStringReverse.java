import java.util.Scanner;

public class _12JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = new StringBuilder(A).reverse().toString();
        System.out.println(A.compareTo(B)==0 ? "Yes" : "No");
    }
}


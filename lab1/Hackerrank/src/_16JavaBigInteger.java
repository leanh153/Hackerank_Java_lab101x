import java.math.BigInteger;
import java.util.Scanner;

public class _16JavaBigInteger {
    public static void main(String[] argh) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        s.close();
        BigInteger val1 = new BigInteger(a);
        BigInteger val2 = new BigInteger(b);
        BigInteger val3 = val1.add(val2);
        BigInteger val4=val1.multiply(val2);
        System.out.println(val3);
        System.out.println(val4);
    }
}




// this WordUtils class existed on HackerRank, this maybe run on HackerRank only
//import org.apache.commons.lang3.text.WordUtils;
// use (WordUtils.capitalizeFully(A) + " " + WordUtils.capitalizeFully(B))
// instead capitalize(A) + " " + capitalize(B)

import java.util.Scanner;

import static com.sun.xml.internal.ws.util.StringUtils.capitalize;

public class _10JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");

        System.out.println(capitalize(A) + " " + capitalize(B));
    }
}


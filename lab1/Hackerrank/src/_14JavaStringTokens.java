import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class _14JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Matcher matcher = Pattern.compile("[A-Za-z !,?._'@]+").matcher(s.trim());
        if (matcher.find()) {
            String[] array = matcher.group().split("[ !,?._'@]+");
            System.out.println(array.length);
            for (String anArray : array) {
                System.out.println(anArray);
            }
        } else {
            System.out.println(0);
        }
        scan.close();

    }
}



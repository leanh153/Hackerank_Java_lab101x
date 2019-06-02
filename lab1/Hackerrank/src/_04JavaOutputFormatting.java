import java.util.Scanner;

public class _04JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            String x1 = String.valueOf(x);
            if(x1.length()<2){
                x1="00" + x1;
            }else if(x1.length()<3){
                x1 = "0" +x1;
            }
            System.out.printf("%-15s%3s%n", s1, x1);
        }
        System.out.println("================================");

    }
}



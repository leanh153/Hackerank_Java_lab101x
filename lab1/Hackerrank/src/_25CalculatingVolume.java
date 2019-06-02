import java.security.Permission;
import java.util.Scanner;

public class _25CalculatingVolume {
    static class Calculate {
        Scanner scanner;
        Display output;
        static final double PI = Math.PI;
        Calculate() {
            scanner = new Scanner(System.in);
            output = new Display();
        }

        static DoCalc do_calc() {
            return new DoCalc();
        }

        final static class Display {
            static void display(double volume) {
                System.out.println(String.format("%.3f", volume));
            }
        }

        int get_int_val() {
            int num = Integer.valueOf(scanner.next());
            if (num <= 0) {
                throw new NumberFormatException("All the values must be positive");
            }
            return num;
        }

        double get_double_val() {
            double num = Double.valueOf(scanner.next());
            if (num <= 0) {
                throw new NumberFormatException("All the values must be positive");
            }
            return num;
        }

        final static class DoCalc {

            // ch = 1
            int get_volume(int var) {
                return (int) Math.pow(var, 3);
            }

            // ch = 2
            int get_volume(int l, int b, int h) {
                return l * b * h;
            }

            // ch = 3
            double get_volume(double volume) {
                return PI * Math.pow(volume, 3) * 2 / 3;
            }

            // ch = 4
            double get_volume(double r, double h) {
                return PI * Math.pow(r, 2) * h;
            }

        }

    }
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Calculate cal = new Calculate();
            int T = cal.get_int_val();
            while (T--> 0) {
                double volume = 0.0;
                int ch = cal.get_int_val();
                if (ch == 1) {
                    int a = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(a);
                } else if (ch == 2) {
                    int l = cal.get_int_val();
                    int b = cal.get_int_val();
                    int h = cal.get_int_val();
                    volume = Calculate.do_calc().get_volume(l, b, h);

                } else if (ch == 3) {
                    double r = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r);

                } else if (ch == 4) {
                    double r = cal.get_double_val();
                    double h = cal.get_double_val();
                    volume = Calculate.do_calc().get_volume(r, h);

                }
                cal.output.display(volume);
            }

        } catch (NumberFormatException e) {
            System.out.print(e);
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    } //end of main


} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {}

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
} //end of Do_Not_Terminate

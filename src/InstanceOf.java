import java.util.Scanner;

public class InstanceOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator my = new MyCalculator();
        int n = sc.nextInt();
        System.out.print("I implemented: ");
        String str = implementedInterfaceNames(my);
        System.out.println(str.substring(str.indexOf("$") + 1));
        System.out.println(my.divisor_sum(n));
    }

    interface AdvancedArithmetic {
        int divisor_sum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic {

        @Override
        public int divisor_sum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    static String implementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            return interfaceName;
        }
        return null;
    }
}

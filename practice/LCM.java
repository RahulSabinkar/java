import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        long num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        long num2 = input.nextInt();
        num1 = (num1>0)?num1: -num1;
        num2 = (num2>0)?num2: -num2;
        System.out.println("LCM: "+lcm(num1, num2));
    }
    static long lcm (long a, long b) {
        long lcm = Math.max(a,b);
        while (true) {
            if (lcm%a==0 && lcm%b==0)
                return lcm;
            lcm++;
        }
    }
}

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println("GCF: "+gcd(num1,num2));
    }
    public static long gcd(long a, long b) {
        long ans = 1;
        for (int i=1; i<=a && i<=b; ++i ) {
            if (a%i==0 && b%i==0)
                ans = i;
        }
        return ans;
    }
}

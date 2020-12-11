// This is more efficient than GCD.java and even accepts negative integers
import java.util.Scanner;
public class GCD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        long input1 = input.nextLong();
        System.out.print("Enter the second integer: ");
        long input2 = input.nextLong();
        input1 = (input1 > 0)? input1: -input1;
        input2 = (input2 > 0)? input2: -input2;
        System.out.println("GCD: "+gcd(input1, input2));
    }
    static long gcd (long n1, long n2) {
        while (n1 != n2) {
            // Larger value is substracted by smaller one until both are equal
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        // When both variables become equal, that value is GCD
        return n2;
    }
}

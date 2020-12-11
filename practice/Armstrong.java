import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        int digits = digit(input);
        int result = armstrong(input, digits);
        if (input == result)
            System.out.println("It is an Armstrong number.");
        else
            System.out.println("It is NOT an Armstrong number");
    }
    static int digit(int n) {
        int d = 0;
        while (n!=0) {
            n /= 10;
            ++d;
        }
        return d;
    }
    static int armstrong (int input, int digit) {
        int[] num = new int[digit];
        int ans = 0;
        for (int i = digit-1; i >= 0; --i) {
            num[i] = input % 10;
            ans += (int) Math.pow(num[i], digit);
            input /= 10;
        }
        return ans;
    }
}
import java.util.Scanner;

public class ArmstrongBetweenIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start point: ");
        int start = input.nextInt();
        System.out.print("Enter end point: ");
        int end = input.nextInt();
        if (start>end) {
            start = start + end;
            end = start - end;
            start = start - end;
        }
        for (int i = start; i<end; i++) {
            int digits = digit(i);
            if (i == armstrong(i, digits))
                System.out.print(i+" ");
        }
        System.out.print("\n");
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

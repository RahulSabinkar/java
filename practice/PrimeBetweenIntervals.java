import java.util.Scanner;
public class PrimeBetweenIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start point: ");
        long start = input.nextLong();
        System.out.print("Enter end point: ");
        long end = input.nextLong();
        if (start == 0)
            start += 2;
        if (start == 1)
            start++;
        System.out.print("Prime numbers: "+start);
        for (long i=start+1; i <= end; ++i) {
            boolean isPrime = true;
            for (long j=2; j < i/2; ++j) {
                if (i % j==0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.print(", "+i);
        }
        System.out.println(".");
    }
}
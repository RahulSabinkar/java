import java.util.Scanner;
public class PrimeIntervalsWithFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start point: ");
        long start = input.nextLong();
        System.out.print("Enter end point: ");
        long end = input.nextLong();
        primeIntervals(start, end);
    }
    public static void primeIntervals (long start, long end) {
        // if (start == 0)
        //     start += 2;
        // else if (start == 1)
        //     start++;
        start = (start==0)? start+2: start;
        start = (start==1)? start+1: start;
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

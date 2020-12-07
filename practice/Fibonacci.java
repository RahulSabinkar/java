// The Fibonacci series is a series where the next term is the sum of the previous two terms.
// The first two terms of the Fibonacci sequence are 0 followed by 1.
// Ex: The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
import java.util.Scanner;
class Fibonacci {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max range: ");
        int max = input.nextInt();
        int n1=0, n2=1;
        System.out.print("Fibonacci Sequence: "+n1+", "+n2);
        for (int i=2; i!=max; i++)
        {
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
            System.out.print(", "+next);
        }
        System.out.println(".");
    }
}

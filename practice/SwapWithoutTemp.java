// Program to swap two numbers without using temporary variable
import java.util.Scanner;
class SwapWithoutTemp {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for A: ");
        int A = input.nextInt();
        System.out.print("Enter number for B: ");
        int B = input.nextInt();

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("Value of A now: "+A);
        System.out.println("Value of B now: "+B);

    }
}

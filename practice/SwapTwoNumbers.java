// Program to Swap two numbers using temp value
import java.util.Scanner;
class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for A: ");
        int a = input.nextInt();
        System.out.print("Enter number for B: ");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Variable A is now: "+a);
        System.out.println("Variable B is now: "+b);
    }
}

// Check whether given number is even or odd
import java.util.Scanner;
class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num % 2 == 0)
            System.out.println(num+" is Even number.");
        else
            System.out.println(num+" is Odd number.");
    }
}

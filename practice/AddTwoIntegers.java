// Program to add two integers
import java.util.Scanner;
class AddTwoIntegers {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println("Sum: "+(num1+num2));
    }
}

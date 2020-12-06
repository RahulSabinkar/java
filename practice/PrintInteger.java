// Java Program to print integer entered by user
import java.util.Scanner;
class PrintInteger {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Displaying given integer: "+num);
    }
}

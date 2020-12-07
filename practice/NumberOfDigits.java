import java.util.Scanner;
class NumberOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        byte digit = 0;
        while (number != 0)
        {
            digit++;
            number /= 10;
        }
        System.out.println("Digits: "+digit);
    }
}

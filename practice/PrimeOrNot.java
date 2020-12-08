import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();
        if (number == 0 || number == 1)
            System.out.println("It is NOT a prime number");
        else {
            boolean isPrime = true;
            for (int i = 2; i <= number/2; ++i) {
                if (number % i == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.println("It is a prime number.");
            else
                System.out.println("It is NOT a prime number");
        }
    }
}

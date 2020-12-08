import java.util.Scanner;
class FactorialRecursive {
    static long recursive (long n)
    {
        if (n != 1)
            return (n*recursive(n-1)); // Recursive Call
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        long number = input.nextInt();
        System.out.println("Factorial: "+recursive(number));
    }
}

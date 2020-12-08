import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        long number = input.nextLong();
        long reverse = 0;
        for (long i = number; i != 0; i/=10)
        {
            long remainder = i % 10;
            reverse = reverse * 10 + remainder;
        }
        if (number==reverse)
            System.out.println("Reverse number is: "+reverse+"\nGiven number is Palidrome");
        else
            System.out.println("Reverse number is: "+reverse+"\nGiven number is NOT Palidrome");
    }
}

// Check whether input character is alphabet or not
import java.util.Scanner;
class AlphabetOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90))
            System.out.println("It is an alphabet.");
        else
            System.out.println("It is NOT an alphabet.");
    }
}

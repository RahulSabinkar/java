import java.util.Scanner;
class NumberOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int digit = str.length();
        System.out.println(digit);

    }
}

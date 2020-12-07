import java.util.Scanner;
class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter a character: ");
            char ch = input.next().charAt(0);
            int ascii_value = (int)ch;
            System.out.println("ASCII Value of "+ch+": "+ascii_value);
        }
    }
}

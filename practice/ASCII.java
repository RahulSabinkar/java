import java.util.Scanner;
class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        int ascii_value = (int)ch;
        System.out.println("ASCII Value: "+ascii_value);
    }
}

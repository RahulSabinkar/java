import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        long temp = number;
        long reverse = 0;
        while (temp != 0)
        {
            int remainder = (int)(temp % 10);
            reverse = reverse*10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse: "+reverse);
    }
}

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        System.out.println(number+"^"+power+" = "+Math.pow(number, power));
    }
}

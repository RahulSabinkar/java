import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = input.nextInt();
        int factorial = num;
        for (int i=--num; i!=1; i--)
            factorial *= i;
        System.out.println("Factorial: "+factorial);
    }
}

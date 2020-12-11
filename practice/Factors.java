import java.util.Scanner;

class Factors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a natural number: ");
		int integer = input.nextInt();
		factor(integer);
	}
	static void factor(int number) {
		System.out.print("Factors: 1");
		for (int i=2; i<=number/2+1; ++i) {
			if (number % i == 0)
				System.out.print(", "+i);
		}
        System.out.println(", "+number+".");
	}
}

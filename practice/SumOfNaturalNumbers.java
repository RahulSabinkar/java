// Find sum of natural numbers between given range
import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start point: ");
        int start = input.nextInt();
        System.out.print("Enter end point: ");
        int end = input.nextInt();
        int sum = 0;
        for (int i=++start;i!=end;i++)
            sum += i;
        System.out.println("Sum of natural numbers between "+start+" and "+end+" is "+sum);
    }
}

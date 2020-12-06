// Display the largest/greatest number out of three numbers
import java.util.Scanner;
class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer A: ");
        int A = input.nextInt();
        System.out.print("Enter integer B: ");
        int B = input.nextInt();
        System.out.print("Enter integer C: ");
        int C = input.nextInt();

        if (A >= B && A >= C)
            System.out.println(A+" is the greatest number.");
        else if (B >= A && B >= C)
                System.out.println(B+" is the greatest number.");
            else
                System.out.println(C+" is the greatest number.");
    }
}

import java.util.Scanner;
class MultiplicationTable {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        for (int i=1; i<11; i++)
            System.out.format("%d  x  %d  =  %d\n", n, i, (n*i));
    }
}

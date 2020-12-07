// Finding if input year is leap year or not
import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year%4==0)
            if (year%200=0)
                System.out.println("Leap Year!");
            else

    }
}

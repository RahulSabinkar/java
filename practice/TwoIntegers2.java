// Arithmatic Operations on two integers with different approach
import java.util.Scanner;
class TwoIntegers2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first value: ");
        double num1 = input.nextDouble();
        System.out.print("Enter operator: ");
        char operator = input.next().charAt(0);
        System.out.print("Enter second value: ");
        double num2 = input.nextDouble();

        switch (operator)
        {
            case '+': System.out.println((num1)+" + "+(num2)+" = "+(num1+num2));
                      break;
            case '-': System.out.println((num1)+" - "+(num2)+" = "+(num1-num2));
                      break;
            case '*': System.out.println((num1)+" * "+(num2)+" = "+(num1*num2));
                      break;
            case '/': System.out.println((num1)+" / "+(num2)+" = "+(num1/num2));
                      break;
            case '%': System.out.println((num1)+" % "+(num2)+" = "+(num1%num2));
                      break;
            default:  System.out.println("Invalid Arithmetic Operator.");
                      break;
        }

    }
}

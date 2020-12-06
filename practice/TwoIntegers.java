// Arithmetic Operations between two integers
import java.util.Scanner;
class TwoIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.print("Available operators:\n1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Remainder\nEnter any operator: ");
        //char symbol = input.next().charAt(0);
        //String symbol = input.next();
        int symbol = input.nextInt();
        switch (symbol)
        {
            case 1: System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    break;
            case 2: System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    break;
            case 3: System.out.println(num1+" * "+num2+" = "+(num1*num2));
                  break;
            case 4: System.out.println(num1+" / "+num2+" = "+(num1/num2));
                  break;
            case 5: System.out.println(num1+" % "+num2+" = "+(num1%num2));
                    break;
            default: System.out.println("Invalid arithmetic operator.");
        }
    }
}

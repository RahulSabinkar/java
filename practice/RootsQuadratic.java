// To find out roots of a quadratic equation
import java.util.Scanner;
class RootsQuadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Equation: ax^2 + bx + c = 0\nEnter value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        double discriminant = (b*b)-(4*a*c);
        if (discriminant > 0)
        {
            System.out.println("Roots are Real and Distinct.");
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            double root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("Roots are: "+root1+", "+root2);
        }
        else if (discriminant == 0)
            {
            System.out.println("Roots are Real and Equal.");
            double root = (-b)/(2*a);
            System.out.println("Roots are: "+root+", "+root);
            }
        else
        {
            System.out.println("Roots are complex and distinct.");
            double real = (-b) / (2*a);
            double imaginary = Math.sqrt(-discriminant) / (2*a);
            System.out.print("Roots are: "+real+" + "+imaginary+"i");
            System.out.println("\n       and "+real+" - "+imaginary+"i");
        }
    }
}

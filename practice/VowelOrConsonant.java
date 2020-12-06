// Check whether a character is vowel or consonant
import java.util.Scanner;
class VowelOrConsonant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char ch = input.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}

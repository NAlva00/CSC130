
package hexdigit2dec;
import java.util.Scanner;

/**
 *
 * @author Alvar_e7q8jjz
 */
public class HexDigit2Dec {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a hex digit: ");
        String hexString = input.nextLine();
        
        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You nust enter exactly one character");
            System.exit(1);
        }
    
        // Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
        int value = ch - 'A' + 10;
        System.out.println("The decimal value for hex digit "+ ch +" is "+ value);
        }
        else if (Character.isDigit(ch)){
        System.out.println("The decimal value for hex digit "+ ch +" is "+ ch);
        }
        else {
        System.out.println(ch +" is an invalid input");
        }
    }
    
}

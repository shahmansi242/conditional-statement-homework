import java.util.Scanner;
import java.util.concurrent.Callable;

public class UpperToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";
       System.out.println("Enter any word ");
       str = scanner.nextLine();
        String lowerCaseString ="",upperCaseString ="";
       lowerCaseString = str.toLowerCase();
       upperCaseString = str.toUpperCase();
        System.out.println("Lower Case String:" + lowerCaseString);
        System.out.println("Upper Case String:" + upperCaseString);


    }
}
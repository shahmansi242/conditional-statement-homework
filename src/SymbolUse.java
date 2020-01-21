import java.util.Scanner;

public class SymbolUse {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        double a = symbol.nextInt();
        double b = symbol.nextInt();
        System.out.println("Enter an operator(+,-,*,/):");
        char operator = symbol.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
            default:
                System.out.println(" operator is not valid");


        }

    }

}

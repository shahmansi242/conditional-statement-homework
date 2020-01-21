import java.util.Scanner;

public class InterchangeNumber {
    public static void main(String[] args) {


    int a;
    int b;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the value of a and b");
    a = scanner.nextInt();
    b = scanner.nextInt();
    System.out.println("Before swapping\na=" +a+ "\nb=" +b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After swapping\na=" +a+ "\nb=" +b);
}
}



import java.util.Scanner;

public class TurneryCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        String str = (number %2==0) ? " even " : " odd ";
        System.out.println(number + " is " + str);
    }
}

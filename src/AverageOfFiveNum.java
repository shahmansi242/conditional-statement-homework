import java.util.Scanner;

public class AverageOfFiveNum {
    public static void main(String[] args) {
        int scr1;
        int scr2;
        int scr3;
        int scr4;
        int scr5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the scr1");
        scr1 = scanner.nextInt();
        System.out.println("Enter the scr2");
        scr2 = scanner.nextInt();
        System.out.println("Enter the scr3");
        scr3 = scanner.nextInt();
        System.out.println("Enter the scr4");
        scr4 = scanner.nextInt();
        System.out.println("Enter the scr5");
        scr5 = scanner.nextInt();
        System.out.println("Average of the scr is = "+(scr1+scr2+scr3+scr4+scr5)/5);

    }
}

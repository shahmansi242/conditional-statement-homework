import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student Name");
    String a1 = scanner.next();
    System.out.println("Enter Roll Number");
    String a2 = scanner.next();
    System.out.println(" Enter English Marks");
    int b1 = scanner.nextInt();
    System.out.println("Enter Maths Marks");
    int b2 = scanner.nextInt();
    System.out.println("Enter Science Marks");
    int b3 = scanner.nextInt();
    System.out.println("Total Marks");
    System.out.println(b1+b2+b3);
    System.out.println("Percentage");
    int b4 = (b1 + b2 + b3)/3;
    System.out.println(b4 +"%");
    if (b1 < 35 || b2 < 35 || b3 < 35){
        System.out.println("Fail");
    }else {
        System.out.println("pass");
        if (b4 >= 80) {
            System.out.println("Grade is A+");
        } else if (b4 >= 60) {
            System.out.println("Grade is A");
        } else if (b4 >= 50) {
            System.out.println("Grade is B");
        } else if (b4 >= 35) {
            System.out.println("Grade is c");
        }
    }
}
}







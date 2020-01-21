import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Letter");
        char ch = scanner.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Ahmedabad");
                break;
            case  'b':
                System.out.println("Baroda");
                break;
            case 'c':
                System.out.println("chandigarh");
                break;
            case 'd':
                System.out.println("Dubai");
                break;
            case 'F':
                System.out.println("Faridabad");
            default:
                System.out.println("Invalid");
        }
    }
}

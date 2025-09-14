import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 120) {
            System.out.println("Valid age.");
        } else {
            System.out.println("Invalid age.");
        }
        scanner.close();
    }
}

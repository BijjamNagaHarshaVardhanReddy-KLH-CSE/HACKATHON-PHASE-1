import java.util.Scanner;

public class WasteStatusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading waste collected in kg from user
        System.out.print("Enter waste collected in kg: ");
        double wasteCollected = scanner.nextDouble();

        // Checking collection target using if-else
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}
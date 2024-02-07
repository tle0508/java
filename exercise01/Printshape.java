package exercise01;
import java.util.Scanner;
public class Printshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print("Enter number (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            try {
                num = Integer.parseInt(userInput);
                if (num > 50 || num <= 0) {
                    System.out.println("Invalid input. Please enter number between 1-50");
                } else {
                    DiamondShape diamond = new DiamondShape(num);
                    ButterflyShape butterfly = new ButterflyShape(num);
                    if (num % 2 == 0) {
                        butterfly.printButterfly();
                    } else {
                        diamond.printDiamond();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit.");
            }
        }
        scanner.close();
    }
}

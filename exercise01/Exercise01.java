package exercise01;

import java.util.List;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            try {
                int num = Integer.parseInt(userInput);
                if (num > 50 || num <= 0) {
                    System.out.println("Invalid input. Please enter number between 1-50");
                } else {
                    Shape shape;
                    if (num % 2 == 0) {
                        shape = new ButterflyShape(num);
                    } else {
                        shape = new DiamondShape(num);
                    }
                    List<String> shapeList = shape.printshape();
                    for (String line : shapeList) {
                        System.out.println(line);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit");
            }
        }
        scanner.close();
    }
}

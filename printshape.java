import java.util.Scanner;

class DiamondShape {
    private int n;

    public DiamondShape(int n) {
        this.n = n;
    }

    public void printDiamond() {

        int mid = n / 2;

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }

    public void printButterfly() {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("+ ");

            System.out.print("  ");

            for (int j = i; j < n; j++)
                System.out.print("  ");
            for (int j = i; j < n; j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("+ ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("+ ");

            if (i == 1) {
                System.out.print("- ");
            } else {
                System.out.print("  ");
            }

            for (int j = 1; j < i; j++)
                System.out.print("  ");
            for (int j = 1; j < i; j++)
                System.out.print("  ");
            for (int j = i; j <= n; j++)
                System.out.print("+ ");
            System.out.println();
        }
    }

}

public class printshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
    
        while (true) {
            System.out.print("Enter number (or type 'exit' to quit): ");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }
            try {
                n = Integer.parseInt(userInput);
                if (n > 50 || n <= 0) {
                    System.out.println("Invalid input. Please enter number between 1-50");
                } else {
                    DiamondShape diamond = new DiamondShape(n);
    
                    if (n % 2 == 0) {
                        diamond.printButterfly();
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

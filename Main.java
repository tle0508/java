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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = scanner.nextInt();
        DiamondShape diamond = new DiamondShape(n);
        if (n % 2 == 0) {

            diamond.printButterfly();
        } else {

            diamond.printDiamond();

        }

    }
}

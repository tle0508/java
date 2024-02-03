
public class ButterFlyPatternExample {
    public static void main(String[] args) {
        int n = 2;
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
package example;

public class RuntimeExceptionExample {

    public static void main(String[] args) {
        try {

            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // ตัวอย่าง RuntimeException: ArithmeticException
        int result = divide(10, 0);
        System.out.println("Result: " + result);// ตัวอย่าง RuntimeException: ArithmeticException

        // ตัวอย่าง RuntimeException: NullPointerException
        String str = null;
        int length = str.length(); // จะเกิด NullPointerException
        System.out.println("Length: " + length);

    }

    // เมทอดที่เกิด RuntimeException: ArithmeticException
    public static int divide(int a, int b) {
        return a / b;
    }
}
import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;

public class TASK9 {

    // Addition
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Division
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {

        int a = 20;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));

    }
}
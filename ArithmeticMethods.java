import java.util.Scanner;

public class ArithmeticMethods {

    /**
     * Adds two numbers using the built-in java arithmetic operator.
     *
     * @param x - first number
     * @param y - second number
     * @return x + y
     */
    private static float sum(float x, float y){
        return x + y;
    }

    /**
     * Adds two numbers using the built-in java arithmetic operator.
     * @param x - first number
     * @param y - second number
     * @return x - y
     */
    private static float difference(float x, float y){
        return x - y;
    }

    /**
     * Multiplies two numbers using the built-in java arithmetic operator.
     * @param x - first number
     * @param y - second number
     * @return x * y
     */
    private static float product(float x, float y){
        return x * y;
    }

    /**
     * Divides two numbers using the built-in java arithmetic operator.
     * @param x - first number
     * @param y - second number
     * @return x / y
     */
    private static float quotient(float x, float y){
        return x / y;
    }


    public static void main(String[] args) {
            // Never ask y x
            float x, y;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number");
            x = input.nextFloat();
            System.out.println("Enter second number");
            y = input.nextFloat();
            System.out.println("/////  Results  /////");
            System.out.println("Sum : " + sum(x, y));
            System.out.println("Difference : " + difference(x, y));
            System.out.println("Product : " + product(x, y));
            System.out.println("Quotient : " + quotient(x, y));
    }
}

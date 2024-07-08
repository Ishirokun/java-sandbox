import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberEvaluator {
        public static void main(String[] args) {
            int a;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number to evaluate: ");
            try {
                a = input.nextInt();
                if (a == 0){
                    System.out.println("The number is a zero, neither positive nor negative");
                }else{
                    if(a < 0){
                        System.out.print("The number is a negative ");
                    }else{
                        System.out.print("The number is a positive ");
                    }
                    if(a%2 == 0){
                        System.out.println("even number.");
                    }else{
                        System.out.println("odd number");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not even a valid number you silly!");
            }
        }
    
}
import java.util.*;


/**
 *  Statement class used to demonstrate the usage of Scanner along with
 *  Nested if and else statement. Let it be noted that the algorithm below is by no means
 *  the best method for finding the biggest number across different values. It is recommended
 *  to use some sort of sorting algorithm.
 */
public class Statements {
    public static void main(String[] args) {
        // Declare integer variables
        int a, b, c;
        // Scanner object for reading inputs.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // Compare values 
        if (a > b && a > c){
            System.out.println("The largests number is " + a);
        }
        else if (b > a && b > c){
            System.out.println("The largests number is " + b);
        }
        else if (c > a && c > b){
            System.out.println("The largests number is " + c);
        }
        else if (a == b && b == c){
            System.out.println("All numbers are equal.");
        }
    }
}
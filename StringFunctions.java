import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        x = input.nextLine();
        System.out.println("The string is " + x.length() + " characters long.");
        System.out.println("Uppercase version of the String : " + x.toUpperCase());
        System.out.println("Lowercase version of the String : " + x.toLowerCase());
        System.out.println("The first character of the String is '" + x.charAt(0) + "' and the last character is '" + x.charAt(x.length()-1) + "'");
        if (x.length() > 5){
            System.out.println("The second character of the string is '" + x.charAt(1) + "' and the fifth character of the string is '" + x.charAt(4) + "'");
        }
    }
    
}

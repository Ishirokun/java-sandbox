import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        String word = new Scanner(System.in).nextLine().replaceAll("[,\\s!&;:]", "");
        if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) System.out.println("Pallindrome");
        else System.out.println("Not Pallindrome");
    }
}

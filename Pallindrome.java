import java.util.Scanner;

public class Pallindrome {

    /**
     * Trims and removes common punctuation marks, symbols and spaces.
     * 
     * List of removed characters:
     * ['.', ',', '!', ';', ':', '&', ' ']
     * 
     * @param string
     * @return result
     */
    public static String isolateLetters(String string){
        String result;
        result = string.trim();
        result = result.replace(".", "");
        result = result.replace(",", "");
        result = result.replace("!", "");
        result = result.replace(";", "");
        result = result.replace(":", "");
        result = result.replace("&", "");
        result = result.replace(" ", "");
        return result;
    }

    public static void main(String[] args) {
        String original, converted;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        // This function captures the next string typed into the terminal.
        original = input.nextLine();

        // isolateLetters functions above
        converted = isolateLetters(original);
        StringBuilder reverse = new StringBuilder(converted);
        reverse.reverse();

        // Ignores capitalization and compares the word into it's reverse, effectively detecting a Pallindrome.
        if(converted.equalsIgnoreCase(reverse.toString())){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
        
    }

}

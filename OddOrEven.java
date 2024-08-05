public class OddOrEven {
    public static void main(String[] args) {
        String message;
        int check_number = 10;
        for(int i = 1; i <= check_number; i++){
            message = (i%2==0) ? i+" is even number" : i+" is odd number";
            System.out.println(message);
        }
    }
}

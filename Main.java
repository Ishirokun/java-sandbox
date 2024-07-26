import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




/**
 * 
 */
public class Main {
    Main(){

    }
}

/**
 * The Client Object is an object that contains the information of a client.
 * It also contains the transactions and methods that allow the alterations of data.
 * 
 * 
 */
class Client {
    int id; // Client ID
    Name name; // Name object
    Address address; // Address object
    String accType;

    List<Transaction> transactions;

    public Transaction createTransaction(){
        System.out.println(new Name());
        return new Transaction();
    }

}

/**
 * 
 */
class VIP extends Client {

}

/**
 * 
 */
class Name {
    String FirstName;
    String LastName;
    String MiddleName;

    public String toString() {
        return String.format("%s %s %s", FirstName, LastName, MiddleName);
    }
}


/**
 * 
 */
class Address {
    String StreetNo;
    String Street;
    String Barangay;
    String Subdivision;
    String City;
    String Province;
    String Region;

    public String getFullAddress() {
        return String.format("%s %s, %s, %s, %s, %s, %s ", StreetNo, Street, Barangay, Subdivision, City, Province);
    }
}

/**
 * 
 */
class Transaction {
    int id;
    TransactionType transType;
    int amount;
}

/**
 * 
 */
enum TransactionType{
    Withdrawal,
    Deposit,
    Check,
    Payment,
    Loan
}
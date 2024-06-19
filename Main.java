import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client();
        System.out.println(c1);
    }
}

/**
 * The Client Object is an object that contains the information of a client.
 * It also contains the transactions and methods that allow the alterations of data.
 */
class Client {
    int id; // Client ID
    Name name; // Name object
    Address address; // Address object
    String accType;

    List<Transaction> transactions;

    public Transaction createTransaction(){
        return new Transaction();
    }

}


class Name {
    String FirstName;
    String LastName;
    String MiddleName;

    public String getFullName() {
        return String.format("%s %s %s", FirstName, LastName, MiddleName);
    }
}

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

class Transaction {
    int id;
    Date transDate;
    TransactionType transType;
    int amount;
}

enum TransactionType{
    Withdrawal,
    Deposit,
    Check,
    Payment,
    Loan
}
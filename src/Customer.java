import java.util.ArrayList;

public class Customer extends User {

    public ArrayList<Transaction> valid_transactions;
    public ArrayList<Transaction> invalid_transactions;
    public Bank bank;
    public static ArrayList<Customer> allCustomers;

    static {
        allCustomers = new ArrayList<>();
    }

    public Customer(Bank bank) {
        this.valid_transactions = new ArrayList<>();
        this.invalid_transactions = new ArrayList<>();
        this.bank = bank;
        allCustomers.add(this);
    }


    // TODO
    public void transaction(float amount, Customer receiver) {
    }

    // TODO
    public void requestLoan(float amount){
    }

    public ArrayList<Transaction> viewValidTransactions() {
        return this.valid_transactions;
    }

    public ArrayList<Transaction> viewInvalidTransactions() {
        return this.invalid_transactions;
    }
}

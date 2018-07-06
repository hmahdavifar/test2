import java.util.ArrayList;

public class Boss extends User {

    public static float balance;

    // TODO
    public Block viewBlockChain(){
        return null;
    }

    public float getBalance() {
        return balance;
    }

    public ArrayList<Transaction> viewInvalidTransactions(){
        ArrayList<Transaction> invalidTransactions = new ArrayList<>();
        for (Customer customer : Customer.allCustomers) {
            for (int j = 0; j < customer.invalid_transactions.size(); j++) {
                invalidTransactions.add(customer.invalid_transactions.get(j));
            }
        }
        return invalidTransactions;
    }
}

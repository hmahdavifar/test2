import java.util.ArrayList;

public class Bank extends User{

    public ArrayList<Customer> customers;

    // TODO
    public void checkLoan(Customer customer){
    }

    // TODO
    public void transaction(float amount, Customer receiver) {
    }

    public ArrayList<Transaction> viewInvalidTransactions(){
        ArrayList<Transaction> invalidTransactions = new ArrayList<>();
        for (Customer customer : customers) {
            for (int j = 0; j < customer.invalid_transactions.size(); j++) {
                invalidTransactions.add(customer.invalid_transactions.get(j));
            }
        }
        return invalidTransactions;
    }

    // TODO
    public void viewCustomerInformation(){

    }

    // TODO
    public Block viewBlockChain(){
        return null;
    }
    
}

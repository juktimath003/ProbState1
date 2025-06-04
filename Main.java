public class Main {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Shreya", "C001", "Belgaum");
        BankTransaction transaction = new BankTransaction("SBI", "Shreya", "Savings", "1234567890", 15000);
        
        customer.displayCustomerDetails();
        transaction.displayTransactionDetails();
    }
}

class BankCustomer {
    String name, id, address;

    BankCustomer(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void displayCustomerDetails() {
        System.out.println("Customer: " + name + ", ID: " + id + ", Address: " + address);
    }
}

class BankTransaction {
    String accountName, holderName, accountType, accountNumber;
    double balance;

    BankTransaction(String accountName, String holderName, String accountType, String accountNumber, double balance) {
        this.accountName = accountName;
        this.holderName = holderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayTransactionDetails() {
        System.out.println("Bank: " + accountName + ", Holder: " + holderName + ", Balance: ₹" + balance);
    }
}

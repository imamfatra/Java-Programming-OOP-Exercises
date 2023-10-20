package exercisesOnComposition.customerAccount;

public class Account {
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private int id;
    private Customer customer;
    private double balance = 0.0;

    Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public String toString() {
        return customer + " balance=$" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance  += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return this;
        } else {
            System.out.println("amount withdraw exceeds the current balance");
            return this;
        }
    }
}

class TestCustomerAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(90, "alis", 'f');
        Account account = new Account(84, customer, 900);
        System.out.println(account);
        account.withdraw(500);
        account.deposit(220);
        System.out.println(account);
    }
}
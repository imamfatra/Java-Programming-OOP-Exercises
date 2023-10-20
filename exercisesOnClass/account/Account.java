package exercisesOnClass.account;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return this.balance = this.balance + amount;
    }

    public int debit(int amount) {
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance){
            another.balance = another.balance + amount;
            this.balance = this.balance -amount;
            return this.balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public String toString() {
        String s = String.format("Account[id=%s,name=%s,balance=%d]", this.id, this.name, this.balance);
        return s;
    }

    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}

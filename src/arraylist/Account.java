package arraylist;

public class Account {
    private int accountNumber;
    private String owner;
    private double balance;

    public Account(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "accountNumber = " + accountNumber +
                ", owner = " + owner +
                ", balance = " + balance +
                '$';
    }

    public void adjust(double amount) {
        balance += amount;
    }
}

package arraylist;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account ahmed = new Account(100, "Ahmed", 50);
        bank.addAccounts(ahmed);
        bank.addAccounts(new Account(200, "Laila", 100));

    }
}

package arraylist;

public class Bank {
    private Account[]  accounts;
    private int next;

    public Bank() {
        accounts = new Account[5];
        next = 0;
    }

    public void addAccounts(Account account) {
        accounts[next++] = account;
    }

    private boolean isEmpty() {
        return accounts == null;
    }

    public void display() {
        for (int i = 0; i < next; i++) {
            System.out.println(accounts[i]);
        }
    }

    public void applyFees() {
        for (int i = 0; i < next ; i++) {
            accounts[i].adjust(-2.95);
        }
    }
}

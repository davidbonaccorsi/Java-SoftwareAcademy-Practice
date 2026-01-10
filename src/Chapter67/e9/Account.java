package Chapter67.e9;

public abstract class Account {
    private final long accountNumber;
    private double balance;

    public Account(){
        this((long) (Math.random()*100), 0);
    };

    public Account(long accountNumber){
        this(accountNumber, 0);
    };

    public Account(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created: " + accountNumber);
    }


    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    protected void addToBalance(double balance) {
        this.balance += balance;
    }

    protected void removeFromBalance(double balance) {
        this.balance -= balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}

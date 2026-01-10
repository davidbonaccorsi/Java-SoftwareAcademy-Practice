package Chapter67.e9;

public class SavingsAccount extends Account{

    public SavingsAccount(){
        this((long) (Math.random()*100), 0);
    }

    public SavingsAccount(long accountNumber){
        this(accountNumber, 0);
    }

    public SavingsAccount(long accountNumber, double balance){
        super(accountNumber, balance);
        System.out.println("Checking account created: " + accountNumber);
    }

    private final double interestRate = 0.05;

    @Override
    public void withdraw(double amount) {
        if(amount < getBalance()) {
            removeFromBalance(amount);
            System.out.println("Savings account withdrawal of " + amount);
        } else {
            System.out.println("Insufficient funds in the savings account...");
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            amount *= 1 + interestRate;
            addToBalance(amount);
            System.out.println("Savings account deposit of " + amount);
        }
    }

    public void compoundInterest(){
        System.out.println("Compounding interest...");
        double balance = getBalance();
        addToBalance(balance*interestRate);
    }
}

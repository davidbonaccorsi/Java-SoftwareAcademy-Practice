package Chapter6.e9;

public class CheckingAccount extends Account{

    public CheckingAccount(){
        this((long) (Math.random()*100), 0);
    }

    public CheckingAccount(long accountNumber){
        this(accountNumber, 0);
    }

    public CheckingAccount(long accountNumber, double balance){
        super(accountNumber, balance);
        System.out.println("Checking account created: " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        double overdraftLimit = 1000;
        double overdraftInterestRate = 0.01;
        double withdrawalFee = 5.0;
        double balance = getBalance();
        double overdraftedAmount = Math.abs(balance - amount);
        if((amount+withdrawalFee) < balance) {
            removeFromBalance(amount+withdrawalFee);
            System.out.println("Checking account withdrawal of " + amount + " with fee of " + withdrawalFee);
        } else if(overdraftedAmount < overdraftLimit){
            double baseRate = 0.01;
            double increasePerStep = 0.005;
            double stepSize = 100.0;

            int steps = (int) (overdraftedAmount / stepSize);

            double finalRate = baseRate + (steps * increasePerStep);

            double interestAmount = overdraftedAmount * finalRate;
            double totalToDeduct = amount + interestAmount;

            removeFromBalance(totalToDeduct);
            System.out.println("Withdrawal: " + amount + " | Interest Rate: " + (finalRate * 100) + "% | Total Interest: " + interestAmount);
        } else {
            System.out.println("Insufficient funds in the checking account and overdraft limit reached...");
        }
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            addToBalance(amount);
            System.out.println("Checking account deposit of " + amount);
        }
    }

}

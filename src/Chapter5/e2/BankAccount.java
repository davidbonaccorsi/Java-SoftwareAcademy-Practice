package Chapter5.e2;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String owner;

    static long totalAccounts = 0;
    static final double INTEREST_RATE = 0.03;

    public BankAccount(String name){
        this.accountNumber = String.valueOf(++totalAccounts);
        this.owner = name;
    }

    public boolean deposit(double amount){
        if(amount < 0){
            System.out.println("Negative amount...");
            return false;
        }
        this.balance+=amount;
        return true;
    }

    public boolean withdraw(double amount){
        if(amount < 0){
            System.out.println("Negative amount...");
            return false;
        } else if(this.balance < amount) {
            System.out.println("Insufficient funds...");
            return false;
        }
        this.balance-=amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest(){
        double receivedInterest = this.balance*INTEREST_RATE;
        this.balance+= receivedInterest;
        System.out.println("Added " + receivedInterest + " to balance.");
    }

    public static long getTotalAccounts(){
        return totalAccounts;
    }

    public boolean transfer(BankAccount destination, double amount){
        if(amount < 0){
            System.out.println("Negative amount...");
            return false;
        } else if(this.balance < amount) {
            System.out.println("Insufficient funds...");
            return false;
        }
        this.balance-=amount;
        destination.balance += amount;

        return true;
    }

    public boolean transfer(String accountNumber, double amount){
        if(amount < 0){
            System.out.println("Negative amount...");
            return false;
        } else if(balance < amount) {
            System.out.println("Insufficient funds...");
            return false;
        }
        balance-=amount;
        System.out.println("Sending " + amount + " to " + accountNumber);
        return true;
    }

    public static void main(String[] args){
        BankAccount a1 = new BankAccount("Josh");
        BankAccount a2 = new BankAccount("Caesar");
        BankAccount a3 = new BankAccount("Dave");

        System.out.println(a1.getBalance());
        System.out.println(a1.deposit(100));
        System.out.println(a2.withdraw(10));
        System.out.println(a1.transfer(a2,50));
        System.out.println(a3.getBalance());
        System.out.println(a2.transfer("1",15));
        a1.applyInterest();
    }

}

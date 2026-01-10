package Chapter67.e9;

import java.util.ArrayList;
import java.util.List;

public class AccountHandler {
    public static void main(String[] args){
        int accountNumber = 0;
        Account a1 = new CheckingAccount();
        Account a2 = new SavingsAccount();

        a1.deposit(1000);
        System.out.println(a2.getBalance());
        a2.withdraw(500);
        System.out.println(a2.getBalance());
        a1.withdraw(100);
        a1.withdraw(1500);

        List<Account> accounts = new ArrayList<>();
        accounts.add(new CheckingAccount(++accountNumber));
        accounts.add(new SavingsAccount(++accountNumber));
        Account a3 = findAccount(1, accounts);
        if (a3 != null){
            a3.withdraw(100);
            a3.deposit(700);
            a3.withdraw(1500);
            System.out.println(a3.getBalance());
        }
    }

    public static Account findAccount(long accountNumber, List<Account> accounts){
        for(Account account : accounts){
            if(account.getAccountNumber() == accountNumber){
                System.out.println("Found account: " + accountNumber + ".");
                return account;
            }
        }
        return null;
    }
}

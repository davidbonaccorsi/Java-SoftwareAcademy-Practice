package Chapter8.e6;

public class Main {

    public static void main(String[] args) throws Exception {
        Account a1 = new Account("A001",1000.0);
        Account a2 = new Account("A002", 2000.0);

        a1 = BankService.merge(a1,a2, (a,b) -> {
            double newBalance = a.balance() + b.balance();
            String newId = a.id() + b.id();
            return new Account(newId, newBalance);
        });

        RiskLevel risk = BankService.evaluate(a2, 500.0, (a, debt) ->
            (a.balance() - debt) < 1000 ? RiskLevel.HIGH : RiskLevel.LOW
        );

        System.out.println(risk);
    }
}

package Chapter88.e6;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BankService {

    public static Account merge(Account a1, Account a2, BinaryOperator<Account> merger) {
        return merger.apply(a1,a2);
    }

    public static RiskLevel evaluate(Account a, double debt, BiFunction<Account, Double, RiskLevel> scorer){
        return scorer.apply(a,debt);
    }


}

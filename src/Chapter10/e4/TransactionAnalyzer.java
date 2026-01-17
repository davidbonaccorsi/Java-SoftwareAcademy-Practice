package Chapter10.e4;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalyzer {

    public record Transaction(String id, String category, double amount, boolean isFraud){}

    public List<String> getCleanTransactionIds(List<Transaction> transactions) {

        /**
         * Method 1: Get Clean Transaction IDs
         *
         * REQUIREMENTS:
         * 1. Filter out any transactions marked as 'fraud'.
         * 2. Filter out transactions with amount less than 10.0 (too small).
         * 3. Extract just the transaction IDs (Map).
         * 4. Sort the IDs alphabetically.
         * 5. Return the list of IDs.
         */

        return transactions.stream()
                .filter(s -> !s.isFraud)
                .filter(s -> s.amount >= 10)
                .map(t -> t.id)
                .sorted()
                .toList();
    }


    /**
     * Method 2: Calculate Category Spending
     *
     * REQUIREMENTS:
     * 1. Filter to include ONLY the specified 'category'.
     * 2. Extract the 'amount' from the transaction.
     * 3. Sum up all the amounts.
     * 4. Return the total.
     *
     * Hint: mapToDouble() is very efficient here.
     */
    public double getTotalSpentByCategory(List<Transaction> transactions, String category) {

        return transactions.stream()
                .filter(s -> !s.category.equals(category))
                .mapToDouble(t -> t.amount)
                .sum();
    }
}

package Chapter11.e5;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class InvoiceGenerator {

    /**
     * Requirement 1: Generate Localized Report
     * * Takes a list of transactions and a target Locale (e.g., US, France).
     * Returns a list of formatted Strings.
     * * FORMAT RULES:
     * 1. Date: Use DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(...)
     * 2. Currency: Use NumberFormat.getCurrencyInstance(...)
     * 3. Output Format: "[Date] : [Currency]"
     * * EXAMPLE (Locale.US):
     * Input: 2023-10-01, 1000.50
     * Output: "10/1/23 : $1,000.50"
     * * EXAMPLE (Locale.FRANCE):
     * Input: 2023-10-01, 1000.50
     * Output: "01/10/2023 : 1 000,50 €"
     */
    public List<String> generateReport(List<Transaction> transactions, Locale locale) {



        DateTimeFormatter newDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        return transactions.stream()
                .map(a -> newDate.format(a.date()) + " : " + numberFormat.format(a.amount()))
                .toList();
    }
}

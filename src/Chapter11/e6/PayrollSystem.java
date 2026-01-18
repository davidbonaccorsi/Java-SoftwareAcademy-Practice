package Chapter11.e6;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PayrollSystem {

    /**
     * Requirement: Generate Payslips
     *
     * 1. Load the ResourceBundle "Payroll" for the given Locale.
     * 2. Stream the employees.
     * 3. Validate logic (using 'validateSalary' helper):
     * - If valid: Format the string using the 'pay_success' bundle key + Currency Formatter.
     * - If 'validateSalary' throws PayrollException: Catch it and return the localized error message from the exception.
     * 4. Return a List<String> of the final messages.
     */
    public List<String> generatePayslips(List<Employee> employees, Locale locale) {

        ResourceBundle bundle = ResourceBundle.getBundle("Payroll",locale);
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance(locale);

        return employees.stream()
                .map(e -> {
                    try{
                        validateSalary(e.salary(),bundle);

                        String pattern = bundle.getString("pay_success");

                        String salaryString = currencyFmt.format(e.salary());

                        return MessageFormat.format(pattern, salaryString, e.name());

                    } catch (PayrollException ex){
                        return ex.getMessage();
                    }})
                .toList();


    }

    /**
     * Helper Validator (Chapter 11 Logic)
     * - Throws Checked Exception if salary is invalid.
     * - You need to look up the ERROR MESSAGE in the ResourceBundle here too!
     */
    private void validateSalary(double salary, ResourceBundle bundle) throws PayrollException {
        if (salary < 0) {
            throw new PayrollException(bundle.getString("error_negative"));
        }
        if (salary < 1000) {
            throw new PayrollException(bundle.getString("error_low"));
        }
    }
}

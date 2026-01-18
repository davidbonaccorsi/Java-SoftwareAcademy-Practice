package Chapter11.e3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingApp {

    public static void main(String[] args){

        displayGreeting(Locale.FRANCE);
        displayGreeting(Locale.US);

    }

    public static void displayGreeting(Locale locale){
        String bundlePath = "Chapter11.e3.Greetings";

        ResourceBundle bundle = ResourceBundle.getBundle(bundlePath, locale);

        System.out.println(bundle.getString("greeting"));

        System.out.println(bundle.getString("farewell"));

        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Formatted price: " + currency.format(99.99));

    }
}

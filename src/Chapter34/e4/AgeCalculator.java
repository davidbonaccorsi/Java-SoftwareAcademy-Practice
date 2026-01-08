package Chapter34.e4;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args){
        System.out.println(GetAge(LocalDate.of(2000, 1, 1)));
        System.out.println(GetAge(LocalDate.of(1985, 12, 25)));
    }

    public static String GetAge(LocalDate birthdate){
        LocalDate today = LocalDate.now();

        if (birthdate.isAfter(today)) {
            return "The child was not born yet";
        }

        Period age = Period.between(birthdate, today);
        System.out.println("Birthday: " + birthdate);
        return ("Age: " + age.getYears() + " years | " + age.getMonths() + " months | " + age.getDays() + " days.");

    }
}

package rest.exercise;

public class TemperatureConverter {

    public static void main(String[] args) {
        double celsius = 34.5;
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Fahrenheit double division: " + fahrenheit);

        int fahrenheit2 = (int) fahrenheit;
        System.out.println("Fahrenheit integer division: " + fahrenheit2);

        System.out.println("Differnce between double and integer is " + (fahrenheit - (double) fahrenheit2));
    }
}

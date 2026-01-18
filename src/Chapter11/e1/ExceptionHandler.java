package Chapter11.e1;

import java.util.Optional;

public class ExceptionHandler {

    public static Optional<Double> safeDivide(int numerator, int denominator){

        try {
            if ( denominator == 0){
                return Optional.empty();
            }

            return Optional.of((double) numerator/denominator);
        } catch (Exception e){
            System.err.println("Unexpected error: " + e.getMessage());
            return Optional.empty();
        }

//        return denominator == 0
//                ? Optional.empty()
//                : Optional.of((double) numerator/denominator);
    }

    public static void main(String[] args){
        System.out.println(safeDivide(10, 2));
        System.out.println(safeDivide(10, 0));
        System.out.println(safeDivide(7, 3));
    }
}

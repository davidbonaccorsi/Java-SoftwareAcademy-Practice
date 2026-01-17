package Chapter10.e1;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ScoreStatisticsCalculator {

    public static Optional<Double> calculateValidAverage(int... scores){
        if(scores.length == 0 || Arrays.stream(scores).anyMatch(s -> s > 100 || s < 0)){
            return Optional.empty();
        }

//        int sum = 0;
//        for(int score : scores){
//            sum += score;
//        }
//
//        return Optional.of((double) sum/scores.length);

        double average = IntStream.of(scores)
                .average()
                .orElse(0.0);

        return Optional.of(average);
    }

    public static void main(String[] args){
        System.out.println(calculateValidAverage(90, 85, 92));
        System.out.println(calculateValidAverage());
        System.out.println(calculateValidAverage(90, 105));
        System.out.println(calculateValidAverage(-5,90));
    }


}

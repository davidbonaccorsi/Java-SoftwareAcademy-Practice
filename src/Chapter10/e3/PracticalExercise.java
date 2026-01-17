package Chapter10.e3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticalExercise {

    public static Map<String, Integer> sumByParity(List<Integer> numbers){
        return numbers
                .stream()
                .collect(Collectors.groupingBy
                        ( n -> n % 2 == 0 ? "even" : "odd",
                                Collectors.summingInt(Integer::intValue)
                        )
                );
    }

    public static void main(String[] args){
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sumByParity(nums));
    }
}

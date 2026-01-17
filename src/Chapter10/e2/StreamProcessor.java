package Chapter10.e2;

import java.util.List;
import java.util.stream.Collectors;

public class StreamProcessor {

    public static void main(String[] args){

        List<String> names = List.of("Alice", "Bob", "Charlie", "Dave", "Eve", "Frank");

        String result = names
                .stream()
                .filter(name -> name.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining(", "));


        System.out.println(result);
    }
}

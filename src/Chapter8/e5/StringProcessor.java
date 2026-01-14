package Chapter8.e5;

import java.util.function.Function;

public class StringProcessor {

    public void processString(String input, Function<String, String> process){
        System.out.println(process.apply(input));
    }
}

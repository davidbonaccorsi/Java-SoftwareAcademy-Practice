package Chapter8.e5;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args){
        StringProcessor sp = new StringProcessor();

        UnaryOperator<String> trim = String::trim;
        UnaryOperator<String> lower = String::toLowerCase;
        UnaryOperator<String> slugify = a -> a.replace(" ","-");

        sp.processString(" jAvA pRoGrAmMiNg ", trim
                .andThen(lower)
                .andThen(slugify)
        );
    }
}

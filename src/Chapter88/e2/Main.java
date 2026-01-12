package Chapter88.e2;

import java.util.Locale;
import java.util.function.*;


public class Main {




    BiPredicate<String,String> p1 = (x,y) -> x.startsWith(y);

    Function<String, Integer> f1 = s -> s.length();

    Consumer<String> c1 = (var s) -> System.out.println(s);

    BiPredicate<String, String> bp = (x, y) -> x.equals(y);

    UnaryOperator<Integer> u1 = x -> { return x * 2 ; };

    Supplier<String> s1 = () -> "Hello";


    Supplier<String> s = String::new;

    Consumer<String> c = str -> System.out.println(str);
    Consumer<String> c2 = System.out::println;

    Predicate<String> p = str -> str.isEmpty();
    Predicate<String> p2 = String::isEmpty;

    Function<String, Integer> f = str -> str.length();
    Function<String, Integer> f2 = String::length;

    UnaryOperator<String> u = str -> str.toUpperCase();
    UnaryOperator<String> u2 = String::toUpperCase;

    BinaryOperator<Integer> b = (a,b) -> Math.max(a,b);
    BinaryOperator<Integer> b2 = Math::max;
}

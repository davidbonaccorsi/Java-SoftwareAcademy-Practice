package Chapter9.e7;

import java.util.List;

public class WildcardExercise {

    public static void printList(List<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }

    public static double sumNumbers(List<? extends Number> numbers){
        double total = 0;
        for(Number n : numbers){
            total += n.doubleValue();
        }
        return total;
    }

    public static void addStrings(List<? super String> list){
        list.add("Java");
        list.add("Collections");

    }
}

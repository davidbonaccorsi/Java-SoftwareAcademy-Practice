package Chapter9.e8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SequencedExercise {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.addFirst(0);

        list.addLast(6);

        System.out.println("First: " + list.getFirst());

        System.out.println("Last: " + list.getLast());

        list.removeFirst();

        list.removeLast();

        System.out.println("Reversed view: " + list.reversed());

        Map<String, Integer> newList = new LinkedHashMap();

        newList.put("1",1);




    }
}

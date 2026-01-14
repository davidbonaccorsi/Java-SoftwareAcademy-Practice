package Chapter9.e2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {

    public static void main(String[] args){

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(5);
        hashSet.add(3);

        System.out.println("Size: " + hashSet.size());

        System.out.println("Contains 2? " + hashSet.contains(2));

        Set<Integer> treeSet = new TreeSet<>(hashSet);

        treeSet.forEach(System.out::println);

        System.out.println("""
                -------
                HASH SET
        """);

        hashSet.forEach(System.out::println);
    }
}

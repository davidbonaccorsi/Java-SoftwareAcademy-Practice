package Chapter9.e1;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args){
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1,"Mango");

        list.set(list.indexOf("Cherry"),"Orange");

        System.out.println("Size: " + list.size());

        list.forEach( System.out::println);

        list.remove("Banana");

        list.forEach( System.out::println);

    }



}

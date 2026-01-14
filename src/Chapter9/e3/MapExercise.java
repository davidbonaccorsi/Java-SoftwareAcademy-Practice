package Chapter9.e3;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args){
        Map<String, String> phonebook = new HashMap<>();

        phonebook.put("Raul", "055-222");
        phonebook.put("Davidoff", "204-492");
        phonebook.put("John", "302-2403");

        phonebook.replace("John","502-203");

        phonebook.putIfAbsent("Han","202-4011");

        System.out.println("Contacts: " + phonebook.keySet());

        phonebook.forEach((n,p) ->
                System.out.println("Name: " + n + " | Phone: " + p)
        );

        System.out.println(phonebook.getOrDefault("Raul","Doesn't exist"));


    }
}

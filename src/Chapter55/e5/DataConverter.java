package Chapter55.e5;

import java.util.ArrayList;

/**
 * Code Challenge 5: The Data Converter
 *
 * DIFFICULTY: Intermediate
 * TOPICS: ArrayList, Wrappers, Varargs, Autoboxing, Method Overloading
 *
 * SCENARIO:
 * You are writing a utility class called 'DataConverter' that helps migrate
 * legacy array-based data into modern Java Collections.
 * You must handle messy data (nulls, primitives mixed with wrappers).
 */
public class DataConverter {

    /**
     * Method 1: Safe Array to List Converter (Varargs)
     *
     * DIFFICULTY: Intermediate
     * TOPICS: Varargs, ArrayList, Enhanced For-Loop
     * * REQUIREMENTS:
     * 1. Accept a variable number of String arguments (Varargs).
     * 2. Convert them into an ArrayList<String>.
     * 3. Filter out any strings that are null.
     * 4. Filter out any strings that are "poison" (case-insensitive).
     * 5. Return the clean ArrayList.
     *
     * @param data The variable arguments of strings
     * @return An ArrayList containing only valid strings
     *
     * EXAMPLES:
     * Input: "Apple", "Banana", null, "Poison", "Date"
     * Output: [Apple, Banana, Date] (ArrayList size 3)
     *
     * Input: "poison", null
     * Output: [] (Empty ArrayList)
     */
    // Write method signature here...
    public ArrayList<String> converter(String... data){
        ArrayList<String> result = new ArrayList<>();

        if(data == null){
            return result;
        }

        for(String arg : data){
            if(arg!=null && !(arg.equalsIgnoreCase("poison"))){
                result.add(arg);
            }
        }
        return result;

    }

    /**
     * Method 2: Wrapper Math (Autoboxing/Unboxing)
     *
     * DIFFICULTY: Tricky
     * TOPICS: Wrappers (Integer, Double), Null Safety, Math API
     *
     * REQUIREMENTS:
     * 1. Accept an ArrayList<Integer> representing raw scores.
     * 2. Calculate the average.
     * 3. If the list is null or empty, return 0.0.
     * 4. If an individual Integer in the list is null, treat it as 0.
     * 5. Return the result as a Double (Wrapper class).
     *
     * HINT: Watch out for integer division! (e.g. 5/2 = 2, but 5.0/2 = 2.5)
     *
     * @param scores List of Integer wrappers
     * @return The average as a Double
     *
     * EXAMPLES:
     * Input: [10, 20, null, 10]
     * Calculation: (10 + 20 + 0 + 10) / 4
     * Output: 10.0
     *
     * Input: [5, 2]
     * Output: 3.5
     */
    // Write method signature here...
    public Double average(ArrayList<Integer> scores){
        if(scores == null || scores.isEmpty()){
            return 0.0;
        }

        double total = 0.0;
        int count = 0;
        for(Integer score : scores){
            if(score!=null){
                total+= score;
            }
            count++;
        }
        return (Double) total/count;
    }

    /**
     * Method 3: The Overloading Trap (Primitives vs Wrappers)
     *
     * DIFFICULTY: Exam Level
     * TOPICS: Method Overloading, Primitives vs Wrappers
     *
     * REQUIREMENTS:
     * 1. Create two methods with the EXACT same name: 'process'.
     * 2. Overload #1: Accepts a single 'int' (primitive) and prints "Primitive: " + value.
     * 3. Overload #2: Accepts a single 'Integer' (wrapper) and prints "Wrapper: " + value.
     * * TASK IN MAIN:
     * Call this method 3 times to prove you know how Java picks the version:
     * 1. Pass a raw number (e.g., 5).
     * 2. Pass a wrapper object (e.g., Integer.valueOf(5)).
     * 3. Pass a raw number cast to int (e.g., (int)5).
     *
     * @param value The number to process
     */
    // Write the two overloaded methods here...
    public static void process(int value){
        System.out.println("Primitive: " + value);
    }

    public static void process(Integer value){
        System.out.println("Wrapper: " + value);
    }

    public static void main(String[] args) {
        // TEST YOUR CODE HERE
        DataConverter dc = new DataConverter();

        // Test Method 1
        // Call safeArrayToList with: "One", null, "Poison", "Two"
        System.out.println(dc.converter("One",null,"Poison","Two"));

        // Test Method 2
        // Create an ArrayList, add 10, null, 20. Call calculateAverage.
        ArrayList<Integer> newArray = new ArrayList<>();
        newArray.add(10);
        newArray.add(null);
        newArray.add(20);

        System.out.println(dc.average(newArray));

        // Test Method 3
        process(10);
        process(Integer.valueOf(10));
        process((int)5);
    }
}

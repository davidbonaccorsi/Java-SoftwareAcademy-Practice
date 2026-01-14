package Chapter9.e4;

import java.util.ArrayList;
import java.util.List;

public class ComparableExercise {

    public static void main(String[] args){
        List<Student> students = new ArrayList <>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        students.sort(Student::compareTo);

        students.forEach(System.out::println);
    }
}

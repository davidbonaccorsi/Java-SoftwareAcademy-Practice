package Chapter9.e5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExercise {
    public static void main(String[] args){

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("Alice", 90));

        Comparator<Student> byName = Comparator.comparing(Student::name);
        students.sort(byName);
        System.out.println("By name: " + students);

        Comparator<Student> byNameThenGrade = Comparator
                .comparing(Student::name)
               .thenComparingInt(Student::grade);
        students.sort(byNameThenGrade);
        System.out.println("By name then grade: " + students);


    }
}

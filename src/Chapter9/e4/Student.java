package Chapter9.e4;

public record Student(String name, int grade) implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.grade, o.grade);
    }


}

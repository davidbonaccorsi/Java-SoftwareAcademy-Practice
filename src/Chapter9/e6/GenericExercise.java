package Chapter9.e6;

public class GenericExercise {

    public static void main(String[] args){

        Box<String> stringBox = new Box<>("Hello");
        Box<String> stringBox1 = new Box<>("41");

        System.out.println(stringBox);

        System.out.println(stringBox1);
    }
}

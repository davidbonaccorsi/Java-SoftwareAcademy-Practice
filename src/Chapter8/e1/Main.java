package Chapter8.e1;

import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Animal> animals = List.of(
                new Animal("Rabbit",true,false),
                new Animal("Fish",false,true),
                new Animal("Pig",false,false)
        );

        print(animals, a -> a.canHop());
        
    }

    public static void print(
            List<Animal> animals,
            CheckTrait checker) {
        for(Animal a : animals){
            if(checker.test(a)){
                System.out.println(a);
            }
        }
    }
}

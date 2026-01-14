package Chapter88.e9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Repository<T> {

    private final List<T> data = new ArrayList<>();

    public Repository<T> save(T item){
        data.add(item);
        return this;
    }

    public List<T> findAll(Predicate<T> criteria){
        List<T> tempList = new ArrayList<>();
        for(T obj : data){
            if(criteria.test(obj)){
                tempList.add(obj);
            }
        }
        return tempList;
    }

    public void updateAll(Predicate<T> criteria, UnaryOperator<T> transformer){
        int updatedItems = 0;
        data.replaceAll(item -> {
                    if (criteria.test(item)) {
                        return transformer.apply(item);
                    }
                    return item;
        });
        System.out.println("Updated " + updatedItems + " objects in list");
    }

    public <R> List<R> map(Function<T, R> mapper){
        List<R> newData = new ArrayList<>();
        for(T obj : data){
            newData.add(mapper.apply(obj));
        }

        return newData;
    }
}

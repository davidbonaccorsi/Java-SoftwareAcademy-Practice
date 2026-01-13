package Chapter88.e7;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class Processor {

    static void processReadings(SensorData data, IntPredicate filter, IntUnaryOperator adjuster, IntConsumer logger){
        for(int i : data.readings()){
            if(filter.test(i)){
                i = adjuster.applyAsInt(i);
                logger.accept(i);
            }
        }
    }
}

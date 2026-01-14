package Chapter6.e17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SatelliteService {

    static void processData(
            List<Telemetry> data,
            Predicate<Telemetry> filter,
            Function<Telemetry, String> transformer,
            Consumer<String> logger
    ){
        for(Telemetry telemetry : data){
            if(filter.test(telemetry)){
                String result = transformer.apply(telemetry);
                logger.accept(result);
            }
        }
    }

    public static void main(String[] args) {
        List<Telemetry> data = new ArrayList<>();
        data.add(new Telemetry("Space",100,true));
        data.add(new Telemetry("Earth",200,false));
        data.add(new Telemetry("Mars",300,true));
        data.add(new Telemetry("Saturn",400,false));


        processData(data, t -> t.voltage() > 10 && t.isStable(), t -> "STATUS OK: " + t.source(), System.out::println);
    }

}

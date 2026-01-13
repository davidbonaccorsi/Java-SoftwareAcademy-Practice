package Chapter88.e8;

import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ToDoubleFunction;

public class GridManager {

    public void processGrid(
            List<PowerSource> sources,
            EfficiencyMode mode,
            ToDoubleFunction<PowerSource> baseCalculator,
            DoubleConsumer reporter
    ){
        for(PowerSource p : sources){
            double rawPower = baseCalculator.applyAsDouble(p);
            mode.adjust(rawPower);
            reporter.accept(rawPower);
        }
    }
}

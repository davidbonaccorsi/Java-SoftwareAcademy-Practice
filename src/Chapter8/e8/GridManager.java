package Chapter8.e8;

import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ToDoubleFunction;

public final class GridManager {

    private static GridManager Instance;

    private GridManager(){
    }

    public static GridManager getInstance(){
        if(Instance == null){
            Instance = new GridManager();
        }
        return Instance;
    }

    public void processGrid(
            List<PowerSource> sources,
            EfficiencyMode mode,
            ToDoubleFunction<PowerSource> baseCalculator,
            DoubleConsumer reporter
    ){
        for(PowerSource p : sources){
            double rawPower = baseCalculator.applyAsDouble(p);
            rawPower = mode.adjust(rawPower);
            reporter.accept(rawPower);
        }
    }
}

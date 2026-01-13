package Chapter88.e8;

public enum EfficiencyMode {
    ECO {
    @Override
    double adjust(double rawOutput) {
        return rawOutput*0.8;
    }
    },
    TURBO{
        @Override
        double adjust(double rawOutput){
            return rawOutput*1.2;
        }
    }, MAX_LOAD{
        @Override
        double adjust(double rawOutput){
            return rawOutput*1.5;
        }
    };

    abstract double adjust(double rawOutput);

}

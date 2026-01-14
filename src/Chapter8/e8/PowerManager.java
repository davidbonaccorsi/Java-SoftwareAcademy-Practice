package Chapter8.e8;

import java.util.ArrayList;
import java.util.List;

public class PowerManager {

    public static void main(String[] args){
        GridManager manager = GridManager.getInstance();
        List<PowerSource> pList = new ArrayList<>();
        pList.add(new Nuclear("1",100));
        pList.add(new Hydro("2",50));
        pList.add(new Solar("3",0.5));
        pList.add(new Hydro("4",20));
        pList.add(new Solar("5",0.2));


        manager.processGrid(
                pList,
                EfficiencyMode.TURBO,
                (s) -> switch(s){
                    case Solar ss -> ss.sunIntensity()*100;
                    case Hydro h -> h.waterFlow()*50;
                    case Nuclear n when (n.coreTemp() > 1000) -> 0.0;
                    case Nuclear nn -> nn.coreTemp()*2;
                },
                System.out::println
        );
    }
}

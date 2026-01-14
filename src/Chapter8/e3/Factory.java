package Chapter8.e3;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Factory {

    public void createAndLog(
            Supplier<Product> maker,
            Consumer<Product> logger
    ){
        Product newProd = maker.get();
        logger.accept(newProd);
    }
}

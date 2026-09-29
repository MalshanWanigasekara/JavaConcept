package Thread;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class PriceCalculation implements Callable<BigDecimal>{

    public BigDecimal call(){
        System.out.println(Thread.currentThread().getName());
        return new BigDecimal("20.00");
    }
}

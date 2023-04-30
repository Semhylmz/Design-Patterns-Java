package behavior.command;

import java.math.BigDecimal;

public class SumCommand implements Operation {
    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}

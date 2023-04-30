package behavior.command;

import java.math.BigDecimal;

public class DivCommand implements Operation {
    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        return num1.divide(num2);
    }
}

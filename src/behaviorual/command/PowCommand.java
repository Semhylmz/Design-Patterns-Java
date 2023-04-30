package behavior.command;

import java.math.BigDecimal;

public class PowCommand implements Operation {
    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        return num1.pow(num2.intValue());
    }
}

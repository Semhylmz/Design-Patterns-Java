package behavior.command;

import java.math.BigDecimal;

public class MultCommand implements Operation {
    @Override
    public BigDecimal operation(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}

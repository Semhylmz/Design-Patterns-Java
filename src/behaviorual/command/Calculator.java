package behavior.command;

import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal operation(Operation operation, BigDecimal num1, BigDecimal num2) {
        return operation.operation(num1, num2);
    }
}

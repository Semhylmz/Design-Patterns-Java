package behavior.command;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.TEN;
        BigDecimal num2 = BigDecimal.valueOf(2);
        System.out.println(Calculator.operation(new SumCommand(), num1, num2));
        System.out.println(Calculator.operation(new SubCommand(), num1, num2));
        System.out.println(Calculator.operation(new MultCommand(), num1, num2));
        System.out.println(Calculator.operation(new DivCommand(), num1, num2));
        System.out.println(Calculator.operation(new PowCommand(), num1, num2));
        System.out.println(Calculator.operation(new ModCommand(), num1, num2));
    }
}

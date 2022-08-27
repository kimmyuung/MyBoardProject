package org.example;

public class SubtractionOperator implements NewArithmeticOperator{
    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber x, PositiveNumber y) {
        return x.toInt() - y.toInt();
    }
}

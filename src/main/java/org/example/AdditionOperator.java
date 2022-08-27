package org.example;

public class AdditionOperator implements NewArithmeticOperator{


    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber x, PositiveNumber y) {
        return x.toInt() + y.toInt();
    }
}

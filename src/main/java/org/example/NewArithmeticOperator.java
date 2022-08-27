package org.example;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber x, PositiveNumber y);
}

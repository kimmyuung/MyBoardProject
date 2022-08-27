package org.example;

import java.util.Arrays;

public enum ArithemeticOperator {
    ADDITION("+"){
        @Override
        public int calculate(int x, int y) {
            return x + y;
        }
    }, SUBRACTION("-"){
        @Override
        public int calculate(int x, int y) {
            return x - y;
        }
    }, MULTIPLY("*") {
        @Override
        public int calculate(int x, int y) {
            return x * y;
        }
    }, DIVISION("/") {
        @Override
        public int calculate(int x, int y) {
            return x / y;
        }
    };

    private final String operator;

    ArithemeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int calculate(final int x, final int y);

    public static int calculate(PositiveNumber x, String opearator, PositiveNumber y) {
        ArithemeticOperator ap = Arrays.stream(values())
                .filter(v -> v.operator.equals(opearator))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("잘못된 연산자 입니다."));

        return ap.calculate(x, opearator, y);
    }

}

package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/*
    요구사항
    1. 간단한 사칙연산 가능
    2. 양수로만 계산 가능
    3. 나눗셈에서 8을 나누는 경우 IllegalArgumentException 예외 발생
    4. MVC 패턴 기반으로 구현
     */
public class CalculatorTest {

    // 1 + 2 -----> Calculator
    //   3   <------
    @DisplayName("Start calcuate")
    @Test
    @MethodSource("formulaAndResult")
    void calculate(int x, String operator, int y) {
        int result = Calculator.calculate(new PositiveNumber(x), operator, new PositiveNumber(y));
        assertThat(result).isEqualTo(result);
    }

   Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
   }

   @DisplayName("나눗셈에서 0을 나누는 경우 예외 발생")
    @Test
    void calculateExceptionTest() {
        assertThatCode( () -> Calculator.calculate(new PositiveNumber(10), "/", new PositiveNumber(0) )
                .istanceof(IllegalArgumentException.class))
                .hasMessage("0 또는 음수를 나눌 수 없습니다.");

    }
}

package org.example;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithemeticOperator
            = List.of(new AdditionOperator(), new SubtractionOperator(), new MultipicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumber x, String opearate ,PositiveNumber y) {

       return arithemeticOperator.stream()
               .filter(arithemeticOperator -> arithemeticOperator.supports(opearate))
               .map(arithemeticOperator -> arithemeticOperator.calculate(x, y))
               .findFirst()
               .orElseThrow(() -> new IllegalArgumentException("Wrong operator"));
    }


}

package org.example.calculate;

import org.example.calculate.domain.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}

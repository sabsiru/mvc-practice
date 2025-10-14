package org.example;

import org.example.calculate.PositiveNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void 덧셈_연산을_수행한다(int operand1, String operator, int operand2, int result) {
        //given
        int calculate = Calculator.calculate(new PositiveNumber(operand1), operator, new PositiveNumber(operand2));

        //when

        //then
        assertThat(calculate).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult() {
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(4, "*", 2, 8),
                arguments(4, "/", 2, 2)
        );
    }
}

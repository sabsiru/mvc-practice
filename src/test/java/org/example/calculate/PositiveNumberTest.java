package org.example.calculate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;


class PositiveNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void 생성테스트(int value) {
        //given
        assertThatCode(()-> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 또는 음수는 허용하지 않습니다.");
        //when

        //then

    }
}
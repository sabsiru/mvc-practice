package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */

class PasswordValidatorTest {

    @Test
    void 비밀번호가_최소_8자이상_12자_이하면_예외가_발생하지않는다() {
        //given
        assertThatCode(() -> PasswordValidator.validate("serverwizard")).
                doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    void 비밀번호가_8자_미만_또는_12자_초과일경우_IllegalArgumentException예외가_발생한다(String password) {
        //given
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(PasswordValidator.WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
    }
}
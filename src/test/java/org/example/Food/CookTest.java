package org.example.Food;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CookTest {

    @Test
    void 요리를_생성한다(){
        //given
        assertThatCode(()-> new Cook("만두", 5000))
                .doesNotThrowAnyException();
        //when

        //then

    }
}

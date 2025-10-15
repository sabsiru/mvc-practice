package org.example.Food;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class MenuItemTest {

    @Test
    void 메뉴항목을_생성한다(){
        //given
        assertThatCode(()-> new MenuItem("만두", 5000))
                .doesNotThrowAnyException();
        //when

        //then

    }
}

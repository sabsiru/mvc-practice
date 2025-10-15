package org.example.Food;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;


public class MenuTest {
    @Test
    void 메뉴판에서_해당하는_메뉴를_반환한다(){
        //given
        Menu menu = new Menu(List.of(new MenuItem("돈까스",5000),
                new MenuItem("냉면", 7000)));
        //when
        MenuItem menuItem = menu.choose("돈까스");

        //then
        assertThat(menuItem).isEqualTo(new MenuItem("돈까스",5000));
    }

    @Test
    void 메뉴판에_없는_메뉴를_선택할시_예외를_반환한다(){
        //given
        Menu menu = new Menu(List.of(new MenuItem("돈까스",5000),
                new MenuItem("냉면", 7000)));

        //when & then
        assertThatCode(()-> menu.choose("통닭"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("해당 메뉴가 없습니다.");
    }
}

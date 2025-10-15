package org.example.Food;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CookingTest {

    @Test
    void  메뉴에_해당하는_음식을_만든다(){
        //given
        Cooking cooking = new Cooking();
        MenuItem menuItem = new MenuItem("돈까스", 5000);

        //when
        Cook cook = cooking.makeCook(menuItem);

        //then
        assertThat(cook).isEqualTo(new Cook("돈까스", 5000));

    }
}

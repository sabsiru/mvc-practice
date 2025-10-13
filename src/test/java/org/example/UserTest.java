package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserTest {
    @Test
    void 패스워드를_초기화한다(){
        //given
        User user = new User();

        //when
        user.initPassword(new CorrectFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNotNull();
    }

    @Test
    void 패스워드가_요구사항에_부합되지않아_초기화되지_않는다(){
        //given
        User user = new User();

        //when
        user.initPassword(new WrongFixedPasswordGenerator());

        //then
        assertThat(user.getPassword()).isNull();
    }

}
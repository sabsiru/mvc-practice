package org.example.http;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QueryStringsTest {
    @Test
    void createQueryStrings(){
        //given
        QueryStrings queryStrings = new QueryStrings("operand1=11&operator=*&operand2=55");
        //when
        assertThat(queryStrings).isNotNull();
        //then

    }

}
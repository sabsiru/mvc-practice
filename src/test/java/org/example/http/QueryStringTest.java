package org.example.http;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class QueryStringTest {
    @Test
    void Query생성(){
        //given
        QueryString queryString = new QueryString("operand1","11");
        //when
        assertThat(queryString).isNotNull();
        //then

    }

}
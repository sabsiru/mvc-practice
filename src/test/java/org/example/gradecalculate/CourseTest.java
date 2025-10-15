package org.example.gradecalculate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class CourseTest {

   @Test
   void 과목을_생성한다(){
       //given
       assertThatCode(() -> new Course("자바",3,"A+"))
               .doesNotThrowAnyException();
   }

}
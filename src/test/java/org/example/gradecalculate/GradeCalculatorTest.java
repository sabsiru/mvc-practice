package org.example.gradecalculate;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 요구사항
 * 평균학점 계산 방법 = (학점수x교과목 평점)의 합계 / 수강신청 총학점 수
 * 일급 컬렉션 사용
 * */
class GradeCalculatorTest {

    @Test
    void 평균_학점을_계산한다(){
        //given
        List<Course> courses = List.of(new Course("자바",3,"A+"),
                new Course("Spring",3,"A+"));
        //when
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double result = gradeCalculator.calculateGrade();

        //then
        assertThat(result).isEqualTo(4.5);

    }
}
package org.example.gradecalculate;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courses) {
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        double multiplyCreditAndCoursesGrade = courses.multiplyCreditAndCoursesGrade();

        int calculateToTotalCompletedCredit = courses.calculateToTotalCompletedCredit();

        return multiplyCreditAndCoursesGrade / calculateToTotalCompletedCredit;
    }
}

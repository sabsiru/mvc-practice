package org.example.gradecalculate;

public class Course {

    private String subject; // 과목명
    private int credit; // 학점
    private String grade;

    public int getCredit() {
        return credit;
    }

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        return this.credit * getGradeToNumber();
    }

    public double getGradeToNumber() {
        double grade = 0;
        switch (this.grade) {
            case "A+":
                grade = 4.5;
                break;
            case "A":
                grade = 4.0;
                break;
            case "B+":
                grade = 3.5;
                break;
            case "B":
                grade = 3.0;
                break;
            case "C+":
                grade = 2.5;
                break;
            case "C":
                grade = 2.0;
                break;
            case "D+":
                grade = 1.5;
                break;
            case "D":
                grade = 1.0;
                break;
        }
        return grade;
    }
}

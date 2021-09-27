package ch24;

import java.util.ArrayList;

public class Student {
    private int studentNum;
    private String studentName;
    ArrayList<Subject> subjects = new ArrayList<>();
    private int totalScore = 0;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }
    public void showStudentInfo() {
        for(Subject subject : subjects) {
            System.out.println("학생 " + studentName + "의 "
                    + subject.getSubjectName() + " 과목 성적은 "
                    + subject.getScore() + "입니다.");
            totalScore += subject.getScore();
        }
        System.out.println("학생" + studentName + "의  총점은 " + totalScore + " 입니다.");
    }
}

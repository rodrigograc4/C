package classes;

import classes.Tipos.Grade;

public class CodeOpenQuestion extends Question {
    private String id;
    private Grade grade;
    private String question1;

    public CodeOpenQuestion(String id, Grade grade,String answer, String question1) {
        super(grade, answer);
        this.id = id;
        this.question1 = question1;
    }

    public CodeOpenQuestion(String question1, String answer) {
        super(answer);
        this.question1 = question1;
    }

    @Override
    public boolean isAnswerExpected() {  //sempre falsa
        return false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }
    
}

package classes;

import classes.Tipos.Grade;

public class CodeOutputQuestion extends Question{

    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String question;
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    private String expectedAnswer;
    private String answer;
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public CodeOutputQuestion(Grade grade, String id, String question, String answer) {
        super(grade, answer);
        this.id = id;
        this.question = question;
    }

    public CodeOutputQuestion(String question, String answer) {
        super(answer);
        this.question = question;
        this.answer = answer;
    }

    @Override
    public boolean isAnswerExpected() {
        //como vemos num texto grande que percentagem tá correta????
        if(expectedAnswer.equals(answer)) {
            return true;
        }
        return false;
    }
}

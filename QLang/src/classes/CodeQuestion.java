package classes;

import classes.Tipos.Grade;

public class CodeQuestion extends Question{
    private String id;
    private Grade grade;
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
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

    public CodeQuestion(Grade grade, String id, String question, String answer) {
        super(grade, answer);
        this.id = id;
        this.question = question;
    }

    public CodeQuestion(String question, String answer) {
        super(answer);
        this.question = question;
        this.answer = answer;
    }
    public String getId() {
            return id;
        }

    public void setId(String id) {
            this.id = id;
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

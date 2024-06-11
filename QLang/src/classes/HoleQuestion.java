package classes;

import classes.Tipos.Grade;

public class HoleQuestion extends Question {
    private String id;
    private String question;
    private Grade grade;
    private String answerUser;

    public HoleQuestion(String id, Grade grade, String question, String answer, String answerUser) {
        super(grade, answer);
        this.id=id;
        this.question = question;
        this.grade=grade;
        this.answerUser = answerUser;
    }

    public HoleQuestion(String question, String answer) {
        super(answer);
        this.question = question;
        this.answer = answer;
    }

    public boolean isAnswerExpected() {
        if(answerUser.toLowerCase().equals(answer)){
            return true;
        }
        return false;
    }
    protected String answer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getAnswerUser() {
        return answerUser;
    }

    public void setAnswerUser(String answerUser) {
        this.answerUser = answerUser;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    

    
}

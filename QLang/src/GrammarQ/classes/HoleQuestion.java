package classes;

import classes.Tipos.Grade;

public class HoleQuestion extends Question {
    private int id;
    private String question;
    private Grade grade;
    private String answerUser;

    public HoleQuestion(int id, Grade grade, String question, String answer, String answerUser) {
        super(grade, answer);
        this.id=id;
        this.question = question;
        this.grade=grade;
        this.answerUser = answerUser;
    }

    public HoleQuestion(String question, String answer) {
        super();
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

    

    
}

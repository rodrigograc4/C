package classes;

import classes.Tipos.Grade;

public class OpenQuestion extends Question{
    private int id;
    private String question;
    private String expectedAnswer;
    private String answer;

    public OpenQuestion(Grade grade, int id, String question, String answer) {
        super(grade, answer);
        this.id = id;
        this.question = question;
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

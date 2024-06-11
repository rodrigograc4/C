package classes;

import classes.Tipos.Grade;

public class CodeOpenQuestion extends Question {
    private int id;
    private Grade grade;
    private String question1;

    public CodeOpenQuestion(int id, Grade grade,String answer, String question1) {
        super(grade, answer);
        this.id = id;
        this.question1 = question1;
    }


    @Override
    public boolean isAnswerExpected() {  //sempre falsa
        return false;
    }
    
}

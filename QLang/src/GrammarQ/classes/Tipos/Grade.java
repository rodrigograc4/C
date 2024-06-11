package classes.Tipos;

import classes.QuestionType;

public class Grade {
    private QuestionType questionType;
    private Fraction fract;

    public Grade(QuestionType questionType, Fraction fract) {
        this.questionType = questionType;
        this.fract = fract;
    }
    public QuestionType getQuestionType() {
        return questionType;
    }
    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
    public Fraction getFract() {
        return fract;
    }
    public void setFract(Fraction fract) {
        this.fract = fract;
    }
}

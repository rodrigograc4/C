package classes;

import classes.Tipos.Grade;

public abstract class Question {
    private QuestionType questionType;
    private Grade grade;
    private String answer;  

    public Question(){
        
    }

    public Question(String answer){
        this.answer = answer;
    }

    public Question(QuestionType questionType, Grade grade, String answer) {
        this.questionType = questionType;
        this.grade = grade;
        this.answer = answer;
    }

    public Question(Grade grade, String answer) {
        this.grade = grade;
        this.answer = answer;
    }
    
    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    public abstract boolean isAnswerExpected();
}

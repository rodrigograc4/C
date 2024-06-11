package classes;

import classes.Tipos.Grade;
import classes.Tipos.Type;

public abstract class Question {
    private QuestionType questionType;
    private Grade grade;
    private String answer;
    private Type type;
    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Question(String answer) {
        this.answer = answer;
    }

    private String id;

    public Question() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
    @Override
    public String toString() {
        return "Question{" + "questionType=" + questionType + ", grade=" + grade + ", answer=" + answer + '}';
    }

    public abstract boolean isAnswerExpected();
}

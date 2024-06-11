package classes;

import classes.Tipos.Grade;

public class CodeHoleQuestion extends Question {
    private String id;
    private String question;
    private String expectedAnswer;
    private String answer;

    public CodeHoleQuestion(QuestionType questionType, Grade grade, String id, String question, String answer) {
        super(grade, answer);
        this.id = id;
        this.question = question;
    }

    public CodeHoleQuestion(String question, String answer) {
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

    public String getExpectedAnswer() {
        return expectedAnswer;
    }

    public void setExpectedAnswer(String expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

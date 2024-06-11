package classes;

import java.util.*;

public class Test {
    private ResultsToFile resultsToFile;
    private List<Question> questions=new ArrayList<>();
    private Student student;
    private String name;
    private Question question;

    public Test(Student student, String name) {
        this.student=student;
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void writeResultsToFile(){
        resultsToFile.writeResultsToFile();
    }
}

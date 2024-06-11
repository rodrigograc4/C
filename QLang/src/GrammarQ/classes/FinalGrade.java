package classes;

import java.util.List;

public class FinalGrade {
    private Test teste;
    private Double finalGrade;

    public FinalGrade(Test teste) {
        this.teste = teste;
    }

    public Double getFinalGrade() {
        List<Question> questions = teste.getQuestions();
        for(Question question : questions) {
            finalGrade += Double.parseDouble(question.getGrade().toString()); // Cast finalGrade to double
        }
        return finalGrade;
    }
}

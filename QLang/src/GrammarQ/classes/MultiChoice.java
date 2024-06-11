package classes;

import java.util.HashMap;
import java.util.Map;

import classes.Tipos.Grade;

public class MultiChoice extends Question {
    private int id;
    private String question;
    private Map<String, Boolean> options;
    private String optionSelected;


    public MultiChoice(Grade grade, String answer, String question, 
            HashMap<String, Boolean> options, String optionSelected) {
        super(grade, answer);
        this.question = question;
        this.options = options;
        this.optionSelected = optionSelected;
    }

    public void correctAnswer() {
        for (Map.Entry<String, Boolean> option : options.entrySet()) {
            if (option.getValue()) {
                optionSelected= option.getKey();
            }
        }
    }

    @Override
    public boolean isAnswerExpected() {
        if (optionSelected != null && options.containsKey(optionSelected)) {
            return options.get(optionSelected);
        }
        return false;
    }

    public String getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(String optionSelected) {
        this.optionSelected = optionSelected;
    }
}

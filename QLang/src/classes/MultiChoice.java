package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import classes.Tipos.Grade;

public class MultiChoice extends Question {
    private String id;
    private String question;
    private Map<String, Boolean> options;
    private String optionSelected;
    private List<String> optionsArray = new ArrayList<String>();


    public MultiChoice(Grade grade, String answer, String question, 
            HashMap<String, Boolean> options, String optionSelected) {
        super(grade, answer);
        this.question = question;
        this.options = options;
        this.optionSelected = optionSelected;
    }

    public MultiChoice(String question, List<String> options) {
        super(null, null);
        this.question = question;
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

    public List<String> getOptionsArray() {
        for (Map.Entry<String, Boolean> option : options.entrySet()) {
            optionsArray.add(option.getKey());
        }
        return optionsArray;
    }

    public String getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(String optionSelected) {
        this.optionSelected = optionSelected;
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

    public Map<String, Boolean> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Boolean> options) {
        this.options = options;
    }
}

package src.main.java;

public class CheckboxQuestion extends Question {

    public CheckboxQuestion(String question, String answer) {

        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();

        return answer.equalsIgnoreCase(actualAnswer);
    }

}

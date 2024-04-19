package src.main.java;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {

        super(question, answer);
    }


    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();

        return answer.equalsIgnoreCase(actualAnswer);
    }
}

package src.main.java;

public abstract class Question {
    // Class variables
    private final String question;
    private final String answer;

    // Constructors
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }



    // Getters
    public String getTheQuestion() {
        return this.question;
    }
    public String getTheAnswer() {
        return this.answer;
    }


    public abstract boolean checkAnswer(String answer);
}
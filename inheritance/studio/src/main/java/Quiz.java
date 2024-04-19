package src.main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    // Class Variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    // getter
    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    // Add Questions to Quiz

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    // Run the Quiz
    public void runQuiz() {
        // Loop through each question, for each
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());
            String usersAnswer = this.getUsersAnswers();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            System.out.println(userGotQuestionCorrect);
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        // Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Grade: " + percentageCorrect + "%");

    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}


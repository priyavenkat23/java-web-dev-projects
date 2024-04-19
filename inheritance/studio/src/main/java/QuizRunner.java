package src.main.java;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What are the vowels of english alphabet?" +
                "\nA: AEIOU\nB: BRFDS\nPlease type a single letter as an answer: ", "A");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckboxQuestion myCheckBoxQuestion = new CheckboxQuestion("Select all that apply, " +
                "Which fruit is red in color?\nA: Strawberry\nB: Mango\nC: Apples", "A,C");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueOrFalseQuestion myTrueFalseQuestion = new TrueOrFalseQuestion("Elephants are Mammals?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion );


        myQuiz.runQuiz();
    }
}

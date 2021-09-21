package org.launchcode.java.studios.quiz;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz myQuiz = new Quiz();

        MultipleChoice myMultiQuestion = new MultipleChoice("Which of these sounds does a dog make?\nA) Meow\nB) Tweet\nC) Bark\nD) Squeak\nPlease type the letter that corresponds to your answer.", "C");
        myQuiz.addQuestion(myMultiQuestion);

        Checkbox myCheckQuestion = new Checkbox("Which of these animals can fly? Select all that apply.\nA) Penguins\nB) Eagles\nC) Chickens\nD) Owls", "B, D");
        myQuiz.addQuestion(myCheckQuestion);

        TrueFalse myTrueFalseQuestion = new TrueFalse("True or False? Dogs are omnivores.", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        ShortAnswer myShortQuestion = new ShortAnswer("Kangaroos are from which country?", "Australia");
        myQuiz.addQuestion(myShortQuestion);

        //penguins are very cute, so the possible correct answers are 8-10, though the choices are 1-10.
        IntegerScale myIntScaleQuestion = new IntegerScale("On a scale of 1-10, how cute are penguins?", 8, 10);
        myQuiz.addQuestion(myIntScaleQuestion);

        LongAnswer myLongQuestion = new LongAnswer("Why are animals cool?", "Because they are!");
        myQuiz.addQuestion(myLongQuestion);

        myQuiz.runQuiz();


    }

}

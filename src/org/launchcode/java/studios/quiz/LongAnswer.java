package org.launchcode.java.studios.quiz;

public class LongAnswer extends Question{


    public LongAnswer(String aQuestion, String anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer.length() > 500) {
            System.out.println("Answer was longer than 500 characters!");
            return false;
        }

        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }
}

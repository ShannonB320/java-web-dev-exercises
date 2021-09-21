package org.launchcode.java.studios.quiz;

public class ShortAnswer extends Question{


    public ShortAnswer(String aQuestion, String anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        if (answer.length() > 80) {
            System.out.println("Answer was longer than 80 characters!");
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

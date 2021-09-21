package org.launchcode.java.studios.quiz;

public class TrueFalse extends Question {


    public TrueFalse(String aQuestion, String anAnswer) {
        super(aQuestion, anAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if (answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }


}

package org.launchcode.java.studios.quiz;

public class Checkbox extends Question {

    //accessing parent constructor
    public Checkbox(String aQuestion, String anAnswer) {
        super(aQuestion, anAnswer);
    }

    //implements abstract method from the Question class
    @Override
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }


}

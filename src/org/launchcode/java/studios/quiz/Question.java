package org.launchcode.java.studios.quiz;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;


    //constructors, getters, setters
    public Question(String aQuestion, String anAnswer){
        this.theQuestion = aQuestion;
        this.theAnswer = anAnswer;
    }

    public String getTheQuestion() {return this.theQuestion;}

    public String getTheAnswer() {return this.theAnswer;}

    //methods
    public abstract boolean checkAnswer(String answer);


}

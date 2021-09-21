package org.launchcode.java.studios.quiz;

public class IntegerScale extends Question{

    private int lowValue;
    private int highValue;


    //instead of taking in a string answer, we will be taking an integer.
    //the lowVal and highVal in the constructor stand for the possible correct answers
    public IntegerScale(String aQuestion, int lowVal, int highVal) {
        super(aQuestion, null);
        this.lowValue = lowVal;
        this.highValue = highVal;
    }

    //getters for new properties that differ from the other question types!
    public int getLowValue() {return this.lowValue;}
    public int getHighValue() {return this.highValue;}


    @Override
    public boolean checkAnswer(String answer) {
        //get answer as string, but need to compare as an integer
        int answerAsInt = Integer.parseInt(answer);

        if (answerAsInt >= lowValue && answerAsInt <= highValue) {
            return true;
        } else {
            return false;
        }

    }



}

package org.launchcode.java.studios.quiz;

import java.util.ArrayList;
import java.util.Scanner;

//add questions
//run the quiz
//grade the quiz

public class Quiz {

    //class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() { }

    //getter
    public ArrayList<Question> getQuestions() {return this.questions;}

    //methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //loop through each question
        for (Question question : questions) {
            //ask user question
            System.out.println(question.getTheQuestion());
            //get user answer
            String usersAnswer = this.getUserAnswer();
            //check the answer
            boolean userGotAnswerCorrect = question.checkAnswer(usersAnswer);
            //add to numberOfQuestionsCorrect if ? answered correctly
            if (userGotAnswerCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        //grade quiz once all questions have been looped through
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Quiz Grade: " + percentageCorrect + "%");
    }

    private String getUserAnswer() {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }


}

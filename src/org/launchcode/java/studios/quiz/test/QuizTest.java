package org.launchcode.java.studios.quiz.test;
import org.launchcode.java.studios.quiz.*;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class QuizTest {

    //Setup before tests can be run:

    Checkbox myCheckboxQuestion;
    MultipleChoice myMultipleQuestion;
    TrueFalse myTFQuestion;
    IntegerScale myIntScaleQuestion;
    ShortAnswer myShortQuestion;
    LongAnswer  myLongQuestion;
    Quiz myQuiz;

    @Before
    public void setUpTests() {
        this.myCheckboxQuestion = new Checkbox("Checkbox question test.", "Checkbox answer test.");
        this.myMultipleQuestion = new MultipleChoice("MC question test.", "MC answer test.");
        this.myTFQuestion = new TrueFalse("TF question test.", "TF answer test.");
        this.myIntScaleQuestion = new IntegerScale("IntScale question test.", 1, 10);
        this.myShortQuestion = new ShortAnswer("Short question test.", "Short answer test.");
        this.myLongQuestion = new LongAnswer("Long question test.", "Long answer test.");
        this.myQuiz = new Quiz();
    }

    //Testing Checkbox Class

    @Test
    public void checkboxConstructorSetProperties() {
        assertEquals("Checkbox question test.", this.myCheckboxQuestion.getTheQuestion());
        assertEquals("Checkbox answer test.", this.myCheckboxQuestion.getTheAnswer());
    }

    @Test
    public void checkboxCheckAnswerReturnsTrue() {
        boolean actualAnswer = myCheckboxQuestion.checkAnswer("Checkbox answer test.");
        assertTrue(actualAnswer);
    }

    //Testing Multiple Choice Class

    @Test
    public void multipleChoiceConstructorSetProperties() {
        assertEquals("MC question test.", this.myMultipleQuestion.getTheQuestion());
        assertEquals("MC answer test.", this.myMultipleQuestion.getTheAnswer());
    }

    @Test
    public void multipleChoiceCheckAnswerReturnsTrue() {
        boolean actualAnswer = myMultipleQuestion.checkAnswer("MC answer test.");
        assertTrue(actualAnswer);
    }

    //Testing TrueFalse Class

    @Test
    public void trueFalseConstructorSetProperties() {
        assertEquals("TF question test.", this.myTFQuestion.getTheQuestion());
        assertEquals("TF answer test.", this.myTFQuestion.getTheAnswer());
    }

    @Test
    public void trueFalseCheckAnswerReturnsTrue() {
        boolean actualAnswer = myTFQuestion.checkAnswer("TF answer test.");
        assertTrue(actualAnswer);
    }

    //Testing IntegerScale Class

    @Test
    public void intScaleConstructorSetProperties() {
        assertEquals("IntScale question test.", this.myIntScaleQuestion.getTheQuestion());
        assertEquals(1, this.myIntScaleQuestion.getLowValue());
        assertEquals(10, this.myIntScaleQuestion.getHighValue());
    }

    @Test
    public void intScaleCheckAnswerReturnsTrue() {
        boolean actualAnswer = this.myIntScaleQuestion.checkAnswer("5");
        assertTrue(actualAnswer);
    }

    //Testing ShortAnswer Class

    @Test
    public void shortAnswerConstructorSetProperties() {
        assertEquals("Short question test.", this.myShortQuestion.getTheQuestion());
        assertEquals("Short answer test.", this.myShortQuestion.getTheAnswer());
    }

    @Test
    public void shortCheckAnswerReturnsTrue() {
        boolean actualAnswer = this.myShortQuestion.checkAnswer("Short answer test.");
        assertTrue(actualAnswer);
    }

    //Testing LongAnswer Class

    @Test
    public void longAnswerConstructorSetProperties() {
        assertEquals("Long question test.", this.myLongQuestion.getTheQuestion());
        assertEquals("Long answer test.", this.myLongQuestion.getTheAnswer());
    }

    @Test
    public void longCheckAnswerReturnsTrue() {
        boolean actualAnswer = this.myLongQuestion.checkAnswer("Long answer test.");
        assertTrue(actualAnswer);
    }

    //Testing Quiz

    @Test
    public void addQuestionMethodAddsQuestion() {
        Checkbox testQuestion = new Checkbox("Testing question!", "Testing answer!");
        this.myQuiz.addQuestion(testQuestion);
        assertEquals(1, this.myQuiz.getQuestions().size());
    }


}

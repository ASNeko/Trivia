package com.example.testrun;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by joh20 on 1/19/17.
 */

public class Question {

    ArrayList<String> answerChoices = new ArrayList<>();
    String question;
    String answer;

    boolean wrightBros = false;

    public Question(String question, String answer, String a, String b, String c, String d) {

        this.question = question;
        this.answer = answer;

        answerChoices.add(a);
        answerChoices.add(b);
        answerChoices.add(c);
        answerChoices.add(d);




    }

    public void checkAnswer(String possibleAnswer) {

        wrightBros = answer.equals(possibleAnswer);

    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {

        return question;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}

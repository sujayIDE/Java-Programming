package com.onlineexamplesystem;

public abstract class Question {
    private int questionId;
    private String QuestionTitle;
    private int marks;

    public Question(int questionId, String questionTitle, int marks) {
        this.questionId = questionId;
        QuestionTitle = questionTitle;
        this.marks = marks;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionTitle() {
        return QuestionTitle;
    }

    public int getMarks() {
        return marks;
    }

    abstract void displayQuestion();
    abstract void evaluateAnswer();
}

package com.onlineexamplesystem;

public class MCQ extends Question{
    private String correctOption;
    private String studentAnswer;

    public MCQ(int questionId, String questionTitle, int marks, String correctOption, String studentAnswer) {
        super(questionId, questionTitle, marks);
        this.correctOption = correctOption;
        this.studentAnswer = studentAnswer;
    }

    @Override
    void displayQuestion() {
        System.out.println("Question Type :  MCQ");
        System.out.println("Question      : "+getQuestionTitle());
        System.out.println("Option A");
        System.out.println("Option B");
        System.out.println("Option C");
        System.out.println("Option D");
    }

    @Override
    void evaluateAnswer() {
        System.out.println("Evaluating MCQ.....");
        System.out.println("Correct answer : "+correctOption);
        System.out.println("Student answer : "+studentAnswer);

        if(correctOption.equals(studentAnswer))
        {
            System.out.println("Result : Correct");
            System.out.println("Makrs  : "+getMarks());
        }else{
            System.out.println("Result : Wrong");
            System.out.println("Marks  : 0");
        }
    }
}

package com.onlineexamplesystem;

public class CodingQuestion extends Question{
    private String programmingLanguage;
    private int testCasesPassed;
    private int totalTestCases;

    public CodingQuestion(int questionId, String questionTitle, int marks, String programmingLanguage, int testCasesPassed, int totalTestCases) {
        super(questionId, questionTitle, marks);
        this.programmingLanguage = programmingLanguage;
        this.testCasesPassed = testCasesPassed;
        this.totalTestCases = totalTestCases;
    }

    @Override
    void displayQuestion() {
        System.out.println("Question type : Coding Question");
        System.out.println("Language      : Java");
        System.out.println("Question      : "+getQuestionTitle());
    }

    @Override
    void evaluateAnswer() {
        System.out.println("Evaluating Coding Question.....");
        System.out.println("Passed Test Cases   : "+testCasesPassed+"/"+totalTestCases);
        if(testCasesPassed==totalTestCases)
        {
            System.out.println("Result     :  Pass");
            System.out.println("Marks      : "+testCasesPassed*2);
        }else {
            System.out.println("Result     :  Partially Correct");
            System.out.println("Marks      : "+testCasesPassed*2);
        }

    }
}

package com.onlineexamplesystem;

public class Main {
    public static void main(String[] args) {
        MCQ mcq=new MCQ(1,"Capital Of India?",5,"A","A");
        CodingQuestion codingQuestion=new CodingQuestion(101,"Write a program remove owels...",20,"Java",7,10);

        Question [] questions={mcq,codingQuestion};

        for (Question question:questions){
            question.displayQuestion();
            System.out.println();
            question.evaluateAnswer();
            System.out.println("===========================================================");
        }
    }
}

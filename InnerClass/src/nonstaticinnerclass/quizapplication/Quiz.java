package nonstaticinnerclass.quizapplication;

import java.util.Scanner;

public class Quiz {
    String quizName;
    int totalQuestions;

    public Quiz(String quizName, int totalQuestions) {
        this.quizName = quizName;
        this.totalQuestions = totalQuestions;
    }

    void displayQuizInfo()
    {
        System.out.println("Quiz Name : "+quizName);
        System.out.println("Total Questions : "+totalQuestions);
    }

    class StudentAttempt{
        void submitAnswers(int answered){
            displayQuizInfo();
            System.out.println("Answered : "+answered);
            System.out.println("UnAnswered : "+(totalQuestions-answered));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter quiz name:  ");
        String name=sc.nextLine();

        System.out.println("Enter total Questions: ");
        int totalQuestions=sc.nextInt();

       Quiz quiz=new Quiz(name,totalQuestions);
       Quiz.StudentAttempt qs=quiz.new StudentAttempt();
       qs.submitAnswers(15);
    }
}

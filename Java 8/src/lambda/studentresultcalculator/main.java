package lambda.studentresultcalculator;

public class main {
    public static void main(String[] args) {
        Student student=new Student("Sujay",95);

        ResultCalculator pass=marks ->
        {
            if(marks>=40)
            {
                return "PASS";
            }else{
                return "FALSE";
            }
        };

        ResultCalculator grade=marks -> {
            if(marks>=90)
            {
                return "A";
            } else if (marks<90 && marks>=75) {
                return "B";
            } else if (marks<75 && marks>=60) {
                return "C";
            } else if (marks<60 && marks>=40)  {
                return "D";
            }else {
                return "fail";
            }
        };

        ResultCalculator resultMeassage=marks ->
        {
            if(marks>=40)
            {
                return "Congratulations";
            }else {
                return "Better luck next time";
            }
        };

        System.out.println(pass.calculate(student.getMarks()));

        System.out.println(grade.calculate(student.getMarks()));

        System.out.println(resultMeassage.calculate(student.getMarks()));

    }
}

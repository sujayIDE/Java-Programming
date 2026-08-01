package com.universityportal;

public class ResearchStudent extends Student{
    private String researchTopic;
    private String guideName;

    public ResearchStudent(int personId,String name,int age,String gender,int rollno,String course,String researchTopic,String guideName)
    {
        super(personId,name,age,gender,rollno,course);
        this.researchTopic=researchTopic;
        this.guideName=guideName;
    }

    void displayDetails()
    {
        System.out.println("=============ResearchStudent Details==============");
        super.displayDetails();
        System.out.println("Research Topic : "+researchTopic);
        System.out.println("Guide Name     : "+guideName);
    }
}

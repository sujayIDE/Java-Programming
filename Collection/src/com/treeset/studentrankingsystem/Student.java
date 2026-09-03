package com.treeset.studentrankingsystem;

public class Student implements Comparable<Student> {
    private int student_id;
    private String studentName;
    private double marks;

    public Student(int student_id, String studentName, double marks) {
        this.student_id = student_id;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.marks,o.marks);
    }
}

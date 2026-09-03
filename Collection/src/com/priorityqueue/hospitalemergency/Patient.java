package com.priorityqueue.hospitalemergency;

public class Patient implements Comparable<Patient> {
    private int patientId;
    private String patientName;
    private int age;
    private int priority;

    public Patient(int patientId, String patientName, int age, int priority) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.priority = priority;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientName='" + patientName + '\'' +
                ", age=" + age +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if(Integer.compare(this.priority,o.priority)==0)
        {
            return Integer.compare(o.age,this.age);
        }else {
            return Integer.compare(this.priority,o.priority);
        }
    }
}

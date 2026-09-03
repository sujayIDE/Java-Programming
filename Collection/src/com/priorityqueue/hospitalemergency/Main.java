package com.priorityqueue.hospitalemergency;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Patient> patients=new PriorityQueue<>();

        patients.add(new Patient(101,"Kumar",34,2));
        patients.add(new Patient(102,"Rahul",23,2));
        patients.add(new Patient(103,"John",45,1));
        patients.add(new Patient(104,"King",20,3));
        patients.add(new Patient(105,"Ming",19,5));

        //Display patients in the order they should be treated.
        //PriorityQueue does not guarantee sorted iteration. It only guarantees that the head element has the highest priority according to the queue's ordering. To retrieve elements according to priority, we should use poll() repeatedly.
        while (!patients.isEmpty())
        {
            System.out.println(patients.poll());
        }
    }
}

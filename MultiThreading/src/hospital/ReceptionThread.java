package hospital;

import java.util.Queue;

public class ReceptionThread extends Thread{
    Queue<Integer> patient;

    public ReceptionThread(Queue<Integer> patient) {
        this.patient = patient;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
           synchronized (patient)
           {
               while (patient.size()==3)
               {
                   try {
                       System.out.println("Wait ");
                       patient.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
               patient.add(i);
               System.out.println("Patient "+i+" added");
               patient.notify();
           }
        }
    }
}

package hospital;

import java.util.Queue;

public class DoctorThread extends Thread{
    Queue<Integer> patient;

    public DoctorThread(Queue<Integer> patient) {
        this.patient = patient;
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            synchronized (patient)
            {
                while (patient.isEmpty())
                {
                    System.out.println("Doctor wait for patient...");
                    try {
                        patient.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                patient.remove();
                System.out.println("Doctor treated...");
                patient.notify();
            }
        }
    }
}

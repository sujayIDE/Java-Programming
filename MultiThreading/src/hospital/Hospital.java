package hospital;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    public static void main(String[] args) {
        Queue<Integer> patient=new LinkedList<>();
        ReceptionThread receptionThread=new ReceptionThread(patient);
        DoctorThread doctorThread=new DoctorThread(patient);

        receptionThread.start();
        doctorThread.start();
    }
}

package nonstaticinnerclass.hospitaldoctor;

public class Main {
    public static void main(String[] args) {
            Hospital hospital=new Hospital();
            Hospital.Doctor hd=hospital.new Doctor();
            hd.print();
    }
}

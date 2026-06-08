import java.util.*;
public class Hospitalmanager {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Appoitment> appoitments = new ArrayList<>();

    public void addPatient(Patient p){
        patients.add(p);
    }

    public void addDoctor(Doctor D){
        doctors.add(D);
    }

    public Patient findPatient(int id){
        for (Patient p : patients){
            if (p.getId() == id) return p;
        }
        return null;
    }

    public Doctor findDoctor(int id){
        for (Doctor d : doctors){
            if (d.getId() == id) return d;
        }
        return null;
    }

    public void bookAppoitment(int pid , int did){
        Patient p = findPatient(pid);
        Doctor d = findDoctor(did);

        if (p != null && d != null){
            appoitments.add(new Appoitment(p,d));
            System.out.println("Appoitment Booked!");
        }else {
            System.out.println("Invalid ID!");
        }
    }

    public void showAll(){
        for (Appoitment a :appoitments){
            a.display();
        }
    }
}

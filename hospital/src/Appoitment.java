public class Appoitment {
    private Patient patient;
    private Doctor doctor;

    public Appoitment(Patient patient,Doctor doctor){
        this.patient = patient;
        this.doctor = doctor;
    }

    public void display(){
        System.out.println("\\n--- Appointment Details ---");
        patient.display();
        doctor.display();
    }
}

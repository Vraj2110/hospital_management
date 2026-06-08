import java.util.*;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospitalmanager hm = new Hospitalmanager();

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter ID Name Age: ");
                    hm.addPatient(new Patient(sc.nextLine(), sc.nextInt(), sc.nextInt()));
                    break;

                case 2:
                    System.out.println("Enter ID Name Specialization: ");
                    hm.addDoctor(new Doctor(sc.next(), sc.nextInt(), sc.next()));
                    break;

                case 3:
                    System.out.println("Enter Patient ID & Doctor ID: ");
                    hm.bookAppoitment(sc.nextInt(), sc.nextInt());
                    break;

                case 4:
                    hm.showAll();
                    break;

                case 5:
                    return;
            }
        }
    }
}
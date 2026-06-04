public class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int id, String specialization) {
        super(id, name);
        setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null && !specialization.isEmpty()) {
            this.specialization = specialization;
        }
    }

    @Override
    public void display() {
        System.out.println("Doctor name ="+ getName()+"Doctor id ="+ getId()+"Doctor specialization ="+ specialization);
    }
}
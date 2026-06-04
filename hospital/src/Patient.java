public class Patient extends Person {
    private int age;

    public Patient(String name, int id, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    @Override
    public void display() {
        System.out.println("Patient ID: " + getId() +
                ", Name: " + getName() +
                ", Age: " + age);
    }
}

public abstract class Person implements Displayable {
    private int id;
    private String name;

    public Person(int id,String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.isEmpty())
        this.name = name;
    }

    public abstract void display();
}

package composite;

public class Devoloper implements Employee {
    private Integer id;
    private String name;

    public Devoloper(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("        " + name);
    }

    @Override
    public String toString() {
        return "Devoloper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

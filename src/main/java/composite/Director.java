package composite;

import java.util.List;

public class Director implements Employee {
    private Integer id;
    private String name;
    private List<Employee> employees;

    public Director(Integer id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }

    @Override
    public void printName() {
        System.out.println(name);
        for (Employee employee : employees) {
            employee.printName();
        }
    }
}

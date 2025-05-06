package composite;

import java.util.List;

public class TeamLead implements Employee {
    private Integer id;
    private String name;
    private List<Employee> employees;

    public TeamLead(Integer id, String name, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.employees = employees;
    }
    @Override
    public void printName() {
        System.out.println("    " +name);
        for(Employee employee : employees) {
            employee.printName();
        }
    }
}

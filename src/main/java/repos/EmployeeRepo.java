package repos;

import entityes.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {

    private List<Employee> employees;

    public EmployeeRepo() {
        employees=new ArrayList<>();
        employees.add(new Employee(Resources.fioE[0],Resources.phoneNumbers[0],true ));
        employees.add(new Employee(Resources.fioE[1],Resources.phoneNumbers[1],false ));
        employees.add(new Employee(Resources.fioE[2],Resources.phoneNumbers[2],false ));
        employees.add(new Employee(Resources.fioE[3],Resources.phoneNumbers[3],true ));
        employees.add(new Employee(Resources.fioE[4],Resources.phoneNumbers[4],false ));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder();
        int counter=1;
        for(Employee employee:employees){
            s.append(counter++).append("- ").append(employee);
        }

        return s.toString();
    }
}

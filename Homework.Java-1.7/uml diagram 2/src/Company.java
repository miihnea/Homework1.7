import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private Address address;
    private List<Employee> employees = new ArrayList<>();
    Company(String name,Address address)
    {
        this.name=name;
        this.address=address;
    }
    public void addEmployees(Employee employee)
    {
        employees.add(employee);
    }
    public void removeEmployees(Employee employee)
    {
        employees.remove(employee);
    }
    public void printEmployees()
    {
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).displayEmployeeAddress();
        }
    }
    public void printEmployeesName()
    {
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).displayEmployeeName();
        }
    }
    public void moveEmployees(Company company, Employee employee)
    {
        this.addEmployees(employee);
        company.removeEmployees(employee);
    }
}

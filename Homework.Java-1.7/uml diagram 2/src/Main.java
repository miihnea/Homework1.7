import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<Employee>();
        //Company company1;

        Address address1 = new Address("Street A",5,"Craiova");
        Address address2 = new Address("Street B",3,"Constanta");

        Company company1 = new Company("Company1",address1);
        Company company2 = new Company("Company2",address1);
        Employee employee1 = new Employee("Ion",address1);
        Employee employee2 = new Employee("Mitica",address2);

        employees.add(employee1);
        employees.add(employee2);
        System.out.println("Address of all employee:");
        for(int i=0;i<employees.size();i++)
        {
            employees.get(i).displayEmployeeAddress();
        }

        company1.addEmployees(employee1);
        company1.addEmployees(employee2);
        System.out.println("Employee of company1");
        company1.printEmployeesName();
        company1.removeEmployees(employee1);
        System.out.println("Employee of first company after remove");
        company1.printEmployeesName();
        company2.moveEmployees(company1,employee2);
        System.out.println("Employee of company2");
        company2.printEmployeesName();
        System.out.println("Employee of company1");
        company1.printEmployeesName();
    }
}
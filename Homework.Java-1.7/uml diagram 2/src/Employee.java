public class Employee extends Person{
    private Address address;
    Employee(String name, Address address) {
        super(name, address);
        this.address=address;
    }
    public void displayEmployeeName()
    {
        System.out.println(name);
    }
    public void displayEmployeeAddress()
    {
        address.display();
    }
}

package OOP.Sesiunea15.ex8_companyapp;

public class Department {
    private String name;

    private Employee employees;

    private int numberOfEmployeesAdded;

    public Department(String name, Employee employees, int numberOfEmployeesAdded) {
        this.name = name;
        this.employees = employees;
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployeesAdded() {
        return numberOfEmployeesAdded;
    }

    public void setNumberOfEmployeesAdded(int numberOfEmployeesAdded) {
        this.numberOfEmployeesAdded = numberOfEmployeesAdded;
    }

    public void printAllEmployeesNames(){
        for(int i = 0; i < numberOfEmployeesAdded; i++){
            System.out.println(employees[i].getName());
        }
    }

    public void printAllEmployeesAdressStreets(){
        for(int i = 0; i < numberOfEmployeesAdded; i++){
            System.out.println(employees[i].getAdress().getStreet);
        }
    }
}

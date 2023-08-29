package OOP.Sesiunea15.ex8_companyapp;

public class Main {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Los Angeles", "rich street", 1);
        Adress adress2 = new Adress("Los Angeles", "rich street", 2);
        Employee employee1 = new Employee("Ionica", "Georgel", 10000, adress1);
        Employee employee2 = new Employee("Ionica", "Marcel", 10000, adress2);
        Employee[] firstDepEmpList = {employee1, employee2};
//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAdressStreet());
        Department department = new Department("dep1", firstDepEmpList, 2);
        department.printAllEmployeesNames();
        department.printAllEmployeesAdressStreets();
        department.printAllEmployeesAdress();
        department.printNumberOfEmployeeAdded();
        department.searchEmployeeByName();
        department.printSpecificEmployeesAdress();
        department.searchAdressByStreet();
    }
}

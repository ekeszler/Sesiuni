package OOP.Sesiunea15.ex8_companyapp;

public class Main {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Los Angeles", "poor street", 1);
        Adress adress2 = new Adress("Los Angeles", "rich street", 2);
        Adress adress3 = new Adress("Los Angeles", "noname street", 3);
        Employee employee1 = new Employee("Ionica", "Georgel", 12000, adress1);
        Employee employee2 = new Employee("Ionica", "Marcel", 10000, adress2);
        Employee employee3 = new Employee("Ionica", "Mirel", 15000, adress3);
        Employee[] firstDepEmpList = {employee1, employee2};
        Employee[] secondDepEmpList = {employee3};
//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAdressStreet());
        Department department1 = new Department("dep1", firstDepEmpList, 2);
        Department department2 = new Department("dep2", secondDepEmpList, 1);
        department1.printAllEmployeesNames();
        department1.printAllEmployeesAdressStreets();
        department1.printAllEmployeesAdress();
        department1.printNumberOfEmployeeAdded();
        department1.searchEmployeeByName();
        department1.printSpecificEmployeesAdress();
        department1.searchAdressByStreet();
        Department[] departments = {department1, department2};
        Company company = new Company("comp1",2002,departments, 2);
        company.printAllDepartmentsOfCompany();
        company.printAllEmployeesByDepartment();
        company.printNumberOfEmployeesByDepartment();
        company.printStreetsOfEmployeesByDepartment();
        company.printStreetByEmployee();
        company.printWantedEmployee();
        company.printAllEmployees();
        company.printTotalNumberOfEmployees();
        company.printWantedEmployeeFromCompany();
        company.printMaximumSalaryEmployeeFromDep();
        company.prinMaximumSalaryEmployeeFromCompany();
    }
}

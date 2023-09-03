package OOP.Sesiunea15.ex8_companyapp;

import java.util.Arrays;

public class Company {

    private String name;

    private int yearFounded;

    private Department[] departments;

    private int numberOfDepartmentsAdded;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartmentsAdded) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartmentsAdded() {
        return numberOfDepartmentsAdded;
    }

    public void setNumberOfDepartmentsAdded(int numberOfDepartmentsAdded) {
        this.numberOfDepartmentsAdded = numberOfDepartmentsAdded;
    }

    public void printAllDepartmentsOfCompany() {
        //parcurgem array-ul si imprimam fiecare departament intr-un "for"
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            System.out.println(departments[i].getName());
        }
    }

    public void printAllEmployeesByDepartment() {
        String requestedDep = "dep1";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (requestedDep.equals(departments[i].getName())) {
                departments[i].printAllEmployeesNames();
            }
        }
    }

    public void printNumberOfEmployeesByDepartment() {
        String requestedDep = "dep2";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (requestedDep.equals(departments[i].getName()))
                System.out.println(departments[i].getNumberOfEmployeesAdded());
        }
    }

    public void printStreetsOfEmployeesByDepartment() {
        String requestedDep = "dep1";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (requestedDep.equals(departments[i].getName())) {
                departments[i].printAllEmployeesAdressStreets();
            }
        }
    }

    public void printStreetByEmployee() {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            departments[i].printAdressStreetByEmployee();
        }
    }

    public void printWantedEmployee() {
        String requestedDep = "dep1";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if (requestedDep.equals(departments[i].getName())) {
                departments[i].searchEmployeeByName();
            } else {
                System.out.println("angajatul nu se afla in departament");
            }
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            departments[i].printAllEmployeesNames();
        }
    }

    public void printTotalNumberOfEmployees() {
        int totalEmployeesNumber = 0;
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            totalEmployeesNumber += departments[i].getNumberOfEmployeesAdded();
        }
        System.out.println("numarul total de angajati este " + totalEmployeesNumber);
    }

    public void printWantedEmployeeFromCompany() {
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            departments[i].searchEmployeeByName();
        }
    }

    public void printMaximumSalaryEmployeeFromDep(){
        String requestedDep = "dep1";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if(requestedDep.equals(departments[i].getName())){
                System.out.println(departments[i].maxSalaryEmployee());
            }
        }
    }

    public void prinMaximumSalaryEmployeeFromCompany(){
        //prima data trebuie sa aflu cel mai mare salar din companie. Pentru asta definesc o variabila maxSalary in care voi stoca cel mai mare salariu din companie
        int maxSalary = 0;
        String richEmployee = null;
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if(departments[i].maxSalary() > maxSalary){
                maxSalary = departments[i].maxSalary();
                richEmployee = departments[i].maxSalaryEmployee();
            }
        }
        System.out.println("angajatul cu cel mai mare salar din companie este: " + richEmployee);
    }

    public void printMinimumSalaryEmployeeFromCompany(){
        int minSalary = 100000;
        String poorEmployee = null;
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if(minSalary > departments[i].minSalary()){
                minSalary = departments[i].minSalary();
                poorEmployee = departments[i].minSalaryEmployee();
            }
        }
        System.out.println("angajatul cu cel mai mic salar din companie este: " + poorEmployee);
    }

    public void printMinimumSalaryEmployeeFromDep(){
        String requestedDep = "dep2";
        for (int i = 0; i < numberOfDepartmentsAdded; i++) {
            if(requestedDep.equals(departments[i].getName())){
                System.out.println("angajatul cu cel mai mic salar din departament este: " + departments[i].minSalaryEmployee());
            }
        }
    }


}

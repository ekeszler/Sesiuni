package OOP.Sesiunea15.ex8_companyapp;

import java.util.Arrays;

public class Department {
    private String name;

    private Employee[] employees;

    private int numberOfEmployeesAdded;

    public Department(String name, Employee[] employees, int numberOfEmployeesAdded) {
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

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
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
            System.out.println(employees[i].getAdressStreet());
        }
    }

    public void printAllEmployeesAdress(){
        for(int i = 0; i < numberOfEmployeesAdded; i++){
            System.out.println(employees[i].getAdress());
        }
    }

    public void printNumberOfEmployeeAdded(){
            System.out.println(numberOfEmployeesAdded);
    }

    public void searchEmployeeByName(){
        String searchName = "Ionica Georgel";
        for (int i = 0; i < numberOfEmployeesAdded ; i++) {
            if(searchName.equals(employees[i].getName())){
                System.out.println(employees[i].getName());
            }
        }
    }

    public void printSpecificEmployeesAdress(){
        //1. parcurg array-ul de angajati si verific daca angajatul se afla in lista
        //2. daca da, printam adresa angajatului de la pozitia i (care este egal cu numele cerut)
        String employeeName = "Ionica Georgel";
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if(employeeName.equals(employees[i].getName())){
                System.out.println(employees[i].getAdress());
            }
        }
    }

    public void searchAdressByStreet(){
        //1. parcurg array-ul de angajati si verific daca strada ceruta se afla in adresa vreunui angajat
        //2. daca da, printez strada
        String requestedStreet = "rich street";
        for (int i = 0; i < numberOfEmployeesAdded; i++) {
            if(requestedStreet.equals(employees[i].getAdressStreet())){
                System.out.println(employees[i].getAdressStreet());
            }
        }
    }



    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", numberOfEmployeesAdded=" + numberOfEmployeesAdded +
                '}';
    }
}

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

   public void printAllDepartmentsOfCompany(){
      //parcurgem array-ul si imprimam fiecare departament intr-un "for"
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         System.out.println(departments[i].getName());
      }
   }

   public void printAllEmployeesByDepartment(){
      String requestedDep = "dep1";
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         if(requestedDep.equals(departments[i].getName())){
            System.out.println(departments[i].getEmployees().toString());
         }
      }
   }

   public void printAllEmployeesStreetsByDepartment(String departmentName){
       //cautam departamentul in lista de departamente a companiei pe care se apeleaza metoda
       //pe departamentul gasit apelez metoda de printAllEmployeesAdressStreets
   }
}

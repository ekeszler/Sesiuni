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
            departments[i].printAllEmployeesNames();
         }
      }
   }

   public void printNumberOfEmployeesByDepartment(){
      String requestedDep = "dep2";
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         if(requestedDep.equals(departments[i].getName()))
            System.out.println(departments[i].getNumberOfEmployeesAdded());
      }
   }

   public void printStreetsOfEmployeesByDepartment(){
      String requestedDep = "dep1";
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         if(requestedDep.equals(departments[i].getName())){
            departments[i].printAllEmployeesAdressStreets();
         }
      }
   }

   public void printStreetByEmployee(){
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         departments[i].printAdressStreetByEmployee();
      }
   }

   public void printWantedEmployee(){
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         departments[i].searchEmployeeByName();
      }
   }

   public void printAllEmployees(){
      for (int i = 0; i < numberOfDepartmentsAdded; i++) {
         departments[i].printAllEmployeesNames();
      }
   }



   @Override
   public String toString() {
      return "Company{" +
              "name='" + name + '\'' +
              ", yearFounded=" + yearFounded +
              ", departments=" + Arrays.toString(departments) +
              ", numberOfDepartmentsAdded=" + numberOfDepartmentsAdded +
              '}';
   }
}

package OOP.ex9;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("alba", "CJ11ABC", "parcat");
        Masina masina2 = new Masina("neagra", "CJ12ABC", "iesit");
        Masina masina3 = new Masina("albastra", "CJ13ABC", "parcat");
        Masina[] masini1 = {masina1, masina2, masina3};
        Parcare parcare = new Parcare( 0, masini1, 2);
        parcare.situatieMasiniVarianta1();
        //parcare.printMenuVar2();
        //parcare.performSelectionVar2();
        parcare.printMenuVar3();
        parcare.performSelectionVar3();
    }
}

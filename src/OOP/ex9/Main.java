package OOP.ex9;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina("alba", "CJ11ABC", "parcat");
        Masina masina2 = new Masina("neagra", "CJ12ABC", "iesit");
        Masina[] masini1 = {masina1, masina2};
        Parcare parcare = new Parcare( 2, masini1, 150);
        parcare.situatieMasini();
    }
}

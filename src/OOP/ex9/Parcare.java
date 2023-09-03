package OOP.ex9;

import java.util.Scanner;

public class Parcare {


    int locuriOcupate;
    private int totalLocuri;
    private Masina[] masini;

    public Parcare(int locuriOcupate, Masina[] masini, int totalLocuri) {
        //this.locuriOcupate = locuriOcupate;
        this.masini = masini;
        this.totalLocuri = totalLocuri;
    }

    public int getTotalLocuri() {
        return totalLocuri;
    }

    public void setTotalLocuri(int totalLocuri) {
        this.totalLocuri = totalLocuri;
    }

    public Masina[] getMasini() {
        return masini;
    }

    public void setMasini(Masina[] masini) {
        this.masini = masini;
    }

//    public int getLocuriOcupate() {
//        return locuriOcupate;
//    }

//    public void setLocuriOcupate(int locuriOcupate) {
//        this.locuriOcupate = locuriOcupate;
//    }


    public void situatieMasiniVarianta1() {
        if (locuriOcupate > totalLocuri) {
            System.out.println("toate locurile sunt ocupate");
        } else {
            for (int i = 0; i < totalLocuri; i++) {
                if ("parcat".equals(masini[i].getStare())) {
                    System.out.println("Masina " + masini[i].getCuloare() + " cu numarul " + masini[i].getNumarInmatriculare() + " s-a parcat ");
                } else if ("iesit".equals(masini[i].getStare())) {
                    System.out.println("Masina " + masini[i].getCuloare() + " cu numarul " + masini[i].getNumarInmatriculare() + " a parasit parcarea ");
                }
            }
        }
    }

    public void situatieMasiniVarianta2() {
        for (int i = 0; i < totalLocuri; i++) {

        }
    }

    public void printMenuVar2() {
        System.out.println("------MENU------");
        System.out.println("1.PARK");
        System.out.println("2.LEAVE");
        System.out.println("3.EXIT MENU");
    }

    public void performSelectionVar2() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        for (int i = 0; i < totalLocuri; i++) {
                do {
                    System.out.println("va rugam selectati optiunea");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            if(locuriOcupate >= totalLocuri ){
                                System.out.println("ne pare rau, parcarea este plina");
                            }else{
                            System.out.println("Masina " + masini[i].getCuloare() + " a parcat pe locul " + (i+1));
                            locuriOcupate = locuriOcupate + 1;
                            i++;}
                            System.out.println("sunt " + locuriOcupate + " locuri ocupate");
                            break;
                        case 2:
                            System.out.println("S-a eliberat locul de parcare numarul: " + (i));
                            locuriOcupate = locuriOcupate - 1;
                            i--;
                            break;
                        case 3:
                            break;
                    }
                } while (option != 3);

        }
    }
}

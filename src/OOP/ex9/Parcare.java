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
                        if (locuriOcupate >= totalLocuri) {
                            System.out.println("ne pare rau, parcarea este plina");
                        } else {
                            System.out.println("Masina " + masini[i].getCuloare() + " a parcat pe locul " + (i + 1));
                            locuriOcupate = locuriOcupate + 1;
                            i++;
                        }
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

    public void printMenuVar3() {
        System.out.println("------MENU------");
        System.out.println("1.CREATI PARCAREA (OBLIGATORIU)");
        System.out.println("2.PARK");
        System.out.println("3.LEAVE");
        System.out.println("4.STATUS");
        System.out.println("5.EXIT MENU");
    }

    public void performSelectionVar3() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        for (int i = 0; i < totalLocuri; i++) {
            do {
                System.out.println("va rugam selectati optiunea");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("introduceti numarul de locuri pentru noua parcare");
                        totalLocuri = scanner.nextInt();
                        System.out.println("a fost creata o parcare cu " + totalLocuri + " locuri");
                        break;
                    case 2:
                        if (locuriOcupate >= totalLocuri) {
                            System.out.println("ne pare rau parcarea este plina");
                        } else {
                            System.out.println("Masina " + masini[i].getCuloare() + " " + masini[i].getNumarInmatriculare() +  " a parcat pe locul " + (i+1));
                            locuriOcupate = locuriOcupate + 1;
                            i++;
                        }
                        break;
                    case 3:
                        System.out.println("S-a eliberat locul de parcare numarul: " + i);
                        locuriOcupate = locuriOcupate - 1;
                        i--;
                        break;
                    case 4:
                        if(locuriOcupate >= totalLocuri){
                            System.out.println("parcarea este plina");
                        }else{
                        System.out.println(i + " " + masini[i].getNumarInmatriculare() + " " + masini[i].getCuloare());
                        }
                        break;
                    case 5:
                        break;
                }
            } while (option != 5);

        }
    }
}


package OOP.ex9;

public class Parcare {


    private int locuriOcupate;
    private int totalLocuri;
    private Masina[] masini;

    public Parcare(int locuriOcupate, Masina[] masini, int totalLocuri) {
        this.locuriOcupate = locuriOcupate;
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

    public int getLocuriOcupate() {
        return locuriOcupate;
    }

    public void setLocuriOcupate(int locuriOcupate) {
        this.locuriOcupate = locuriOcupate;
    }


    public void situatieMasini(){
        if(locuriOcupate >= totalLocuri){
            System.out.println("toate locurile sunt ocupate");
        }else {
            for (int i = 0; i < locuriOcupate; i++) {
                if ("parcat".equals(masini[i].getStare())) {
                    System.out.println("Masina " + masini[i].getCuloare() + " cu numarul " + masini[i].getNumarInmatriculare() + " s-a parcat ");
                } else if ("iesit".equals(masini[i].getStare())) {
                    System.out.println("Masina " + masini[i].getCuloare() + " cu numarul " + masini[i].getNumarInmatriculare() + " a parasit parcarea ");
                }
            }
        }
    }
}

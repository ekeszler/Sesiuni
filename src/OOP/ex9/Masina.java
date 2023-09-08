package OOP.ex9;


public class Masina {

    String culoare;

    String numarInmatriculare;

    String stare;

    int spot;


    public Masina(String culoare, String numarInmatriculare, String stare) {
        this.culoare = culoare;
        this.numarInmatriculare = numarInmatriculare;
        this.stare = stare;
        this.spot = spot;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getStare() {
        return stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public int getSpot() {
        return spot;
    }
}

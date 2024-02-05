public abstract class Artikal {

    private String naziv;
    private double cena;
    private int kolicina;

    public Artikal(String naziv, double cena, int kolicina) {
        this.naziv = naziv;
        this.cena = cena;
        this.kolicina = kolicina;
    }

    public abstract double izracunajUkupnuCenu();

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Artikal{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", kolicina=" + kolicina +
                '}';
    }
}

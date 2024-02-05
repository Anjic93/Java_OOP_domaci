public class Tehnika extends Artikal{

    private String kategorijaTehnike;
    private int garancija;

    public Tehnika(String naziv, double cena, int kolicina, String kategorijaTehnike, int garancija) {
        super(naziv, cena, kolicina);
        this.kategorijaTehnike = kategorijaTehnike;
        this.garancija = garancija;
    }

    @Override
    public double izracunajUkupnuCenu() {
        double ukupnaCena;
        double pdv;
        ukupnaCena = getKolicina() * getCena();
        pdv = ukupnaCena * 1.1;
        return pdv;
    }


    public String getKategorijaTehnike() {
        return kategorijaTehnike;
    }

    public void setKategorijaTehnike(String kategorijaTehnike) {
        this.kategorijaTehnike = kategorijaTehnike;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }
}

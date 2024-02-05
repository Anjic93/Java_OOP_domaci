public class Hrana extends Artikal{

private String kategorijaHrane;
private int rokTrajanja;

    @Override
    public double izracunajUkupnuCenu() {
        double ukupnaCena;
        ukupnaCena = getKolicina() * getCena();
        return ukupnaCena;
    }
    public Hrana(String naziv, double cena, int kolicina, String kategorijaHrane, int rokTrajanja) {
        super(naziv, cena, kolicina);
        this.kategorijaHrane = kategorijaHrane;
        this.rokTrajanja = rokTrajanja;
    }



    public String getKategorijaHrane() {
        return kategorijaHrane;
    }

    public void setKategorijaHrane(String kategorijaHrane) {
        this.kategorijaHrane = kategorijaHrane;
    }

    public int getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(int rokTrajanja) {
        this.rokTrajanja = rokTrajanja;
    }
}

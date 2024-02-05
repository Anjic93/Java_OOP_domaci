import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

/*
Napraviti apstraktnu klasu Artikal koja sadrži osnovne informacije o proizvodu kao što su naziv,
 cena i dostupna količina.
Definisati apstraktnu metodu izracunajUkupnuCenu koju je potrebno implmentirati u svakoj od
klasa koje nasleđuju apstraktnu klasu Artikal.
Kreirati klase Hrana i Tehnika koje nasleđuju klasu Artikal i dodati dodatne atribute i
metode specifične za svaku kategoriju proizvoda.
U klasi Tehnika na ukupnu cenu dodati PDV od 10%.
Dodati atribute koji opisuju specifične karakteristike proizvoda, na primer,
kategoriju proizvoda ili rok trajanja.
 */

Artikal prvi = new Hrana("Milka Oreo", 450, 8,
        "Slatkisi", 2025 );

Artikal drugi = new Hrana("Vocni jogurt", 120, 3, "Mlecno",
        2024);

Artikal treci = new Tehnika("Iphone 13 mini", 650, 1,
        "Mobilni uredjaji", 2027);


Artikal cetvrti = new Tehnika("Samsung Smart", 1200, 1,
                "Televizori", 2028);


       System.out.println(prvi.getNaziv());
        System.out.println(prvi.getCena() + " dinara");
        prvi.izracunajUkupnuCenu();

        System.out.println(drugi.getNaziv());
        System.out.println(drugi.getCena() + " dinara");
        drugi.izracunajUkupnuCenu();

        System.out.println(treci.getNaziv());
        System.out.println(treci.getCena() + " eura");
        System.out.println("Ukupna cena artikala sa PDV-om: ");
        treci.izracunajUkupnuCenu();


        System.out.println(cetvrti.getNaziv());
        System.out.println(cetvrti.getCena() + " eura");
        System.out.println("Ukupna cena artikala sa PDV-om: ");
        cetvrti.izracunajUkupnuCenu();

       

        ArrayList<Artikal> spisak1 = new ArrayList<>();
        spisak1.add(prvi);
        spisak1.add(drugi);

        System.out.println(spisak1);
        double ukupno1 = prvi.izracunajUkupnuCenu() + drugi.izracunajUkupnuCenu();
        System.out.println("Ukupna cena kupljenih artikala: " + ukupno1 + " dinara");

        ArrayList<Artikal> spisak2 = new ArrayList<>();
        spisak2.add(treci);
        spisak2.add(cetvrti);

        System.out.println(spisak2);

        double ukupno2 = treci.izracunajUkupnuCenu() + cetvrti.izracunajUkupnuCenu();
        System.out.println("Ukupna cena kupljenih artikala sa PDV-om: " + ukupno2 + " eura");



    }
    }

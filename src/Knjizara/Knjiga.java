package Knjizara;


/*
/Zadatak je: kreirati novi paket "Knjizara". U njoj kreirati novu klasu Knjiga, koja se sastoji od naziva, autora i cijene.
//kreirati konstruktor, i metodu koja ispisuje informacije o knjizi. Unijeti 2 knjige i i ispisati njihove vrijednosti.
 */
public class Knjiga {
    private String naziv;
    private String autor;
    private int cijena;

    public Knjiga(String naziv, String autor, int cijena) {
        this.naziv = naziv;
        this.autor = autor;
        this.cijena = cijena;
    }

    @Override
    public String toString() {

        return String.format("%-30s|", naziv) + String.format("%-20s|",autor) + String.format("%-20s|", cijena);
     }
}

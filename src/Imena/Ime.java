package Imena;

public class Ime {
    private String naziv;
    private int ucestalost;

    public String getNaziv() {
        return naziv;
    }

    public int getUcestalost() {
        return ucestalost;
    }

    public Ime(String naziv, int ucestalost) {
        this.naziv = naziv;
        this.ucestalost = ucestalost;
    }

    /*
        String[] imena = {"mara", "pero"};
        String[] prezimena = {"Marić", "perić"};
        *///Kreirati petlju koja će uzimati imena i prezime i skombinirati ih u random imena.

}

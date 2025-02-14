package Ucenik;

import Utils.InfoRowBuilder;

public class Ucenik {
    private String ime;
    private int brojGodina;
    private int[] ocjene = new int[3];

    public Ucenik(String ime, int brojGodina, int[] ocjene) {
        this.ime = ime;
        this.brojGodina = brojGodina;
        this.ocjene = ocjene;
    }

    public void ucenikInfo() {
        InfoRowBuilder infoRowBuilder = new InfoRowBuilder();
        String header = infoRowBuilder
                .addColumn(ime, -20)
                .addColumn(String.valueOf(brojGodina), 10)
                .addColumn(String.format("%.2f", prosjek()), 10)
                .getInfoRow();
        System.out.println(header);
        //System.out.println("Ime: " + ime + " Dob: " + brojGodina + " prosjek: " + prosjek());
    }

    public double prosjek() {
        double p = 0;
        p+=ocjene[0] + ocjene[1] + ocjene[2];
        p/=3.0;
        return p;
    }
}


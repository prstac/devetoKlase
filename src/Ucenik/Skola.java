package Ucenik;

import Imena.ImeFaker;
import Utils.InfoRowBuilder;

import java.util.ArrayList;
import java.util.List;

public class Skola {
    public static List<Ucenik> ucenici = new ArrayList<>();
    public static void main(String[] args) {
        Ucenik ucenik1 = new Ucenik("Pero", 20, new int []{1,2,3});
        Ucenik ucenik2 = new Ucenik("Anica", 21, new int []{2,3,4});
        ucenici.add(ucenik1);
        ucenici.add(ucenik2);

        upisiUcenike(100);
        uceniciInfo();
    }

    private  static void upisiUcenike(int broj) {
        for (int i = 0; i < broj; i++) {
            ucenici.add(
                    new Ucenik(
                            ImeFaker.getRandomIme(),
                            (int)(100*Math.random() + 1),
                            getOcjene()
                    )
            );
        }
    }

    public static int ocijeni() {
        return (int)(Math.random()*5 +1);
    }

    public static int[] getOcjene() {
        int[] ocjene = new int[3];
        for (int i = 0; i <3; i++) {
            ocjene[i] = ocijeni();
        }
        return ocjene;
    }

    public static void uceniciInfo() {
        InfoRowBuilder infoRowBuilder = new InfoRowBuilder();
        String header = infoRowBuilder
                .addColumn("Ime", -20)
                .addColumn("Dob", -10)
                .addColumn("Prosjek", -10)
                .getRowAsHeader();

        System.out.println(header);

        ucenici.forEach(ucenik -> ucenik.ucenikInfo());
    }
}

package Ucenik;

import java.util.ArrayList;
import java.util.List;

public class Skola {
    public static List<Ucenik> ucenici = new ArrayList<>();
    public static void main(String[] args) {
        Ucenik ucenik1 = new Ucenik("Pero", 20, new int []{1,2,3});
        Ucenik ucenik2 = new Ucenik("Anica", 21, new int []{2,3,4});
        ucenici.add(ucenik1);
        ucenici.add(ucenik2);

        uceniciInfo();
    }

    public static void uceniciInfo() {
        String header =
                String.format("|%-20s|", "Ime") +
                        String.format("%-10s|","Dob") +
                        String.format("%-10s|", "Prosjek");
        header = String.join("_", header.split(" "));
        System.out.println(header);

        ucenici.forEach(ucenik -> ucenik.ucenikInfo());
    }
}

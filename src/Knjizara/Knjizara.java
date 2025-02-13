package Knjizara;

import Utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {
    public static List<Knjiga> knjige = new ArrayList<>();
    public static void main(String[] args) {
        Knjiga knjiga1 = new Knjiga("Pero u zemlji cudesa", "Pero P", 20);
        Knjiga knjiga2 = new Knjiga("Alisa u zemlji cudesa", "Alisa A", 30);
        knjige.add(knjiga1);
        knjige.add(knjiga2);

        predstaviKnjige();
        centriraniNaslov();
    }

    public static void predstaviKnjige() {
        //System.out.println("|" + StringUtils.centerHeader("Naslov", 30) + "|" + StringUtils.centerHeader("Autor", 20) + "|" + StringUtils.centerHeader("Cijena",20) + "|");

        String header =
                String.format("|%-30s|","Naslov") +
                String.format("%-20s|","Autor") +
                String.format("%-20s|", "Cijena");
        header = String.join("_", header.split(" "));
        System.out.println(header);

        knjige.forEach(knjiga -> System.out.println(knjiga));
    }

    public static void centriraniNaslov() {
        System.out.println("|" + StringUtils.centerHeader("Naslov", 30) + "|" + StringUtils.centerHeader("Autor", 20) + "|" + StringUtils.centerHeader("Cijena",20) + "|");
    }
}

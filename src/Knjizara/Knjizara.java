package Knjizara;

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
    }

    public static void predstaviKnjige() {
        String linija =
                String.format("%-30s|","Naslov") +
                String.format("%-20s|","Autor") +
                String.format("%-20s|", "Cijena");
        linija = String.join("\u0332", linija.split(" ", -1));
        System.out.println(linija);
        knjige.forEach(knjiga -> System.out.println(knjiga));
    }
}

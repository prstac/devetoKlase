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
        knjige.forEach(knjiga -> System.out.println(knjiga));
    }
}

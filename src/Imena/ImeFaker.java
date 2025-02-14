package Imena;

import java.util.ArrayList;
import java.util.List;

public class ImeFaker {
    public static void main(String[] args) {
        List<String> imena = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            var ime = getRandomIme();
            var prezime = getRandomPrezime();
            imena.add(ime + " " + prezime);
        }
        imena.forEach(System.out::println);
    }

    public static String getRandomIme() {
        if (Math.random() < 0.5) {
            return  getRandomMuskoIme();
        } else {
            return getRandomZenskoIme();
        }
    }

    public static String getRandomMuskoIme() {
        return ImenaReader.muskaImena.get((int)Math.round(Math.random() * (ImenaReader.muskaImena.size() - 1 ))).getNaziv();
    }

    public static String getRandomZenskoIme() {
        return ImenaReader.zenskaImena.get((int)Math.round(Math.random() * (ImenaReader.zenskaImena.size() - 1 ))).getNaziv();
    }

    public static String getRandomPrezime() {
        return ImenaReader.prezimena.get((int)Math.round(Math.random() * (ImenaReader.prezimena.size() - 1)));
    }


}

package Imena;

import java.util.ArrayList;
import java.util.List;

public class ImeFaker {

    private static ImenaReader imenaReader = new ImenaReader();

    public static void main(String[] args) {
        List<String> imena = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            var ime = getRandomIme();
            var prezime = getRandomPrezime();
            imena.add(ime + " " + prezime);
        }
        imena.forEach(ime -> System.out.println(ime));
    }

    public static String getRandomIme() {
        return imenaReader.imena.get((int)Math.round(Math.random() * (imenaReader.imena.size() - 1 ))).getNaziv();
    }

    public static String getRandomPrezime() {
        return imenaReader.prezimena.get((int)Math.round(Math.random() * (imenaReader.prezimena.size() - 1)));
    }


}

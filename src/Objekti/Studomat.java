package Objekti;

import Utils.FindUtils;

import java.util.ArrayList;
import java.util.List;

public class Studomat {
    public static List<Student> studenti= new ArrayList<>();

    public static void dodajStudenta(String ime, String prezime) {
        if (studenti.isEmpty()) {
            studenti.add(new Student(ime, prezime));
        } else studenti.add(new Student(ime, prezime, studenti.getLast().getBrojIndeksa() + 1));
    }

    public static void main(String[] args) {
        dodajStudenta("Mare", "Maric");
        dodajStudenta("Pero", "Peric");
        dodajStudenta("Ante", "Antic");

        System.out.println(studenti.getFirst().getIme());
        studenti.forEach(System.out::println);

        var student2 = FindUtils.findByProperty(studenti, s-> s.getBrojIndeksa() == 2);

        if (student2 != null) {
            student2.setIme("Zdravko");
            student2.dodajIspit("Matematika");
            student2.dodajIspit("Fizika");
            student2.dodajIspit("Kemija");
            student2.ispisiPrijavljeneIspite();
        }

    }
}

package Objekti;

import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private ArrayList<String> prijavljeniIspiti = new ArrayList<>();

    public void dodajIspit(String ispit) {
        prijavljeniIspiti.add(ispit);
    }

    public void ispisiPrijavljeneIspite() {
        System.out.println("Prijavljeni ispiti studenta pod indeksom " + brojIndeksa + " su:");
        prijavljeniIspiti.forEach( ispit-> System.out.println(ispit));
    }

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    public Student(String ime, String prezime) {
        this(ime, prezime, 1);
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }



    public Student(){}

    @Override
    public String toString() {
        return
                        String.format("%-" + ("brojIndexa".length() + 1) + "s", "Ime") + ":" + ime +
                        String.format("\n%-" + ("brojIndexa".length() + 1) + "s", "Prezime") + ":" + prezime +
                        String.format("\n%-" + ("brojIndexa".length() + 1) + "s", "brojIndeksa") + ":" + brojIndeksa+"\n";
    }
}

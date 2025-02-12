import Objekti.Student;

public class Main {
    private String ime;
    private String prezime;
    private int OIB;

    @Override
    public String toString() {
        System.out.println(ime);
        System.out.println(prezime);
        System.out.println(OIB);
        return super.toString();
    }

    public Main(String ime, String prezime, int OIB) {
        this.ime = ime;
        this.prezime = prezime;
        this.OIB = OIB;
    }

    public Main() {
    }

    public String dohvatiPodatke() {
        return
        String.format("%-" + 10 + "s", "Ime: "+ime) +
        String.format("\n%-" + 10 + "s", "Prezime: "+prezime) +
        String.format("\n%-" + 10 + "s", "OIB: "+OIB);
    }

    public static void main(String[] args) {
        Main polaznik1 = new Main();
        Main polaznik2 = new Main();
        Main polaznik3 = polaznik1;
        polaznik3.ime="Ante";
        System.out.println(polaznik1);
        System.out.println(polaznik2);
        System.out.println(polaznik3);
        System.out.println(polaznik1.ime);
        System.out.println(polaznik2.ime);
        System.out.println(polaznik3.ime);


        polaznik1.ime = "Ante";
        polaznik1.prezime = "Antic";
        polaznik1.OIB = 1;

        polaznik2.ime = "Jure";
        polaznik2.prezime = "Juric";
        polaznik2.OIB = 2;

        System.out.println(polaznik1);
        System.out.println(polaznik2);
        System.out.println(polaznik3);

        System.out.println(polaznik1.dohvatiPodatke());
        System.out.println(polaznik2.dohvatiPodatke());

        Main polaznik4 = new Main("Pero", "Peric", 5);
        System.out.println(polaznik4.dohvatiPodatke());

        Student a = new Student(); // importa Objekti paket, ako je public mozemo instancirati
    }
}
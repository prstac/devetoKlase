package Proizvodi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skladiste {
    public static List<Proizvod> proizvodi = new ArrayList<>();

    public static void main(String[] args) {
        unosProizvoda();
        ispisSvihProizvoda();
    }

    public static void unosProizvoda() {
        String naziv = "";
        double cijena = 0.0;
        int kolicina = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Unos novog proizvoda");
            naziv = unosNaziva();
            if (naziv.equals("kraj")) continue;
            cijena = unosCijene();
            kolicina = unosKolicine();

            proizvodi.add(new Proizvod(naziv, cijena, kolicina));
        } while (!naziv.equals("kraj"));

        scanner.close();
    }

    public static  String unosNaziva() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite naziv proizvoda");
        return scanner.nextLine();
    }

    public static int unosKolicine() {
        int kolicina = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Unesite kolicinu proizvoda");
            try {
                kolicina = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Krivi unos, molimo ponovite unos");
            }
        }
        return kolicina;
    }

    public static double unosCijene() {
        Scanner scanner = new Scanner(System.in);
        double cijena = 0.0;

        while (true) {
            System.out.println("Unesite cijenu proizvoda");
            try {
                cijena = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Krivi unos, molimo ponovite unos");
            }
        }
        return cijena;
    }

    public static void ispisSvihProizvoda() {
        var header = String.format("|%-30s|", "Naziv") +
                String.format("%7s|", "Cijena") +
                String.format("%8s|", "Kolicina");
        header = String.join("_", header.split(" "));
        System.out.println(header);
        proizvodi.forEach(proizvod -> System.out.println(proizvod.getInfo()));
    }
}

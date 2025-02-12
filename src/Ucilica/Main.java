package Ucilica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<IGeometrijskiLik> likovi = new ArrayList<>();
    public static void main(String[] args) {
        Trokut trokut1 = new Trokut("trokut 1", 1,1.5,2);
        Pravokutnik pravokutnik1 = new Pravokutnik("pravokutnik 1", 2,3);
        Krug krug1 = new Krug("krug 1", 1);

        likovi.add(trokut1);
        likovi.add(pravokutnik1);
        likovi.add(krug1);

        String linija = "";
        do {
            System.out.println("Unos novog lika. Unesite ime te 1,2 ili 3 vrijednosti odvojene razmakom. Za prekid upisite kraj");
            Scanner scanner = new Scanner(System.in);
            linija = scanner.nextLine();
            if (linija.equals("kraj")) continue;
            var unosiArray = linija.trim().split(" ");
            switch (unosiArray.length) {
                case 2: {
                    likovi.add(new Krug(unosiArray[0], Double.parseDouble(unosiArray[1])));
                    break;
                }
                case 3: {
                    likovi.add(new Pravokutnik(unosiArray[0], Double.parseDouble(unosiArray[1]), Double.parseDouble(unosiArray[2])));
                    break;
                }
                case 4: {
                    likovi.add(new Trokut(unosiArray[0], Double.parseDouble(unosiArray[1]), Double.parseDouble(unosiArray[2]), Double.parseDouble(unosiArray[3])));
                    break;
                }
                default:
                    System.out.println("neispravan unos");
            }
        } while (!linija.equals("kraj"));

        ispisiSveOpsege();
        ispisiSvePovrsine();

        likovi.sort( (s1,s2) -> {
            double razlika = s1.povrsina() - s2.povrsina();
            int returnValue = 0;
            if (razlika > 0) returnValue = 1;
            else if (razlika == 0) returnValue = 0;
            else if (razlika < 0) returnValue = -1;
            return  returnValue;
        });
        ispisiSvePovrsine();
    }

    public static void ispisiSveOpsege() {
        likovi.forEach(l -> System.out.println(l.opseg()));
    }

    public static void ispisiSvePovrsine() {
        likovi.forEach(l -> System.out.println(l.povrsina()));
    }
}

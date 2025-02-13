package Auto;

import java.util.ArrayList;
import java.util.List;

public class TestVoznje {
    public static List<Auto> automobili = new ArrayList<>();
    public static void main(String[] args) {
        Auto automobil = new Auto(Autos.FIAT, 129, 3);
        Auto automobil1 = new Auto(Autos.BMW, 229, 5);

        automobili.add(automobil1);
        automobili.add(automobil);

        System.out.println(automobil1.dohvatAutomobila());
        automobil1.paljenjeAuta();
        automobil1.gasenjeAuta();
        automobil1.isUpaljen();

        predstaviAutomobile();
        upaliAutomobile();

        for (int i = 0; i < 10; i++) {
            prolaziGodina();
        }
    }

    public static void prolaziGodina() {
        System.out.println("Prolazi godina");
        automobili.forEach(automobil -> automobil.ostariGodinuDana());
        predstaviAutomobile();
    }

    public static  void predstaviAutomobile() {
        System.out.println("Predstavljamo nase automobile:");
        automobili.forEach(auto -> System.out.println(auto.dohvatAutomobila()));
    }

    public static void upaliAutomobile() {
        System.out.println("Palim automobile");
        automobili.forEach(auto -> auto.paljenjeAuta());
    }

}

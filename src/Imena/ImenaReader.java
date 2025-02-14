package Imena;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ImenaReader {
    public static List<Ime> zenskaImena = new ArrayList<>();
    public static List<Ime> muskaImena = new ArrayList<>();
    public static List<String> prezimena = new ArrayList<>();
    private static boolean ucitano = false;

    ImenaReader(){
        if (ucitano) return;
        ucitajSve();
        ucitano = true;
    }

    private static void ucitajSve() {
        ucitajMuskaImena();
        ucitajZenskaImena();
        ucitajPrezimena();
    }

    private static void ucitajZenskaImena() {
        zenskaImena = ucitajImena("./src/Imena/imenazenska.txt");
    }

    private static void ucitajMuskaImena() {
        muskaImena = ucitajImena("./src/Imena/imena.txt");
    }

    private static List<Ime> ucitajImena(String path) {
        List<Ime> imena = new ArrayList<>();
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine().trim().replaceAll(" +", " ");
                var dataArray = Arrays.stream(data.split("\t")).toList();
                if (dataArray.size() < 3) {
                    dataArray = Arrays.stream(data.split(" ")).toList();
                };
                imena.add(new Ime(dataArray.get(1), Integer.parseInt(dataArray.get(2))));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return imena;
    }

    private static void ucitajPrezimena() {
        try {
            File myObj = new File("./src/Imena/prezimena.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.trim();
                prezimena.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

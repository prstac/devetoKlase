package Imena;

import Utils.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ImenaReader {
    public static List<Ime> imena = new ArrayList<>();
    public static List<String> prezimena = new ArrayList<>();

    ImenaReader(){
        ucitajSve();
    }

    private static void ucitajSve() {
        ucitajImena();
        ucitajPrezimena();
    }

    private static void ucitajImena() {
        try {
            File myObj = new File("./src/Imena/imena.txt");

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

package Utils;


public class StringUtils {
    public static String centerHeader(String naslov, int length){
        var praznine = length - naslov.length();
        StringBuilder noviNaslov = new StringBuilder();
        for (int i = 0; i < praznine/2; i++) {
            noviNaslov.append(" ");
        }
        noviNaslov.append(naslov);
        for (int i = 0; i < length - noviNaslov.length(); i++) {
            noviNaslov.append(" ");
        }
        return noviNaslov.toString();
    }
}

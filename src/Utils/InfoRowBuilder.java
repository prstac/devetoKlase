package Utils;

public class InfoRowBuilder {
    private String row = "|";

    public InfoRowBuilder addColumn(String name, int padding)  {
        row += String.format("%"+padding+ "s|",name);
        return this;
    }

    public String getInfoRow() {
        return row;
    }

    public String getRowAsHeader() {
        return String.join("_", row.split(" "));
    }
}

package Ucilica;

public class Pravokutnik implements IGeometrijskiLik {
    private double a;
    private double b;
    private String naziv = "Pravokutnik";

    public Pravokutnik(String naziv, double b, double a) {
        this.b = b;
        this.a = a;
        this.naziv = naziv;
    }

    public double povrsina() {
        return a*b;
    }

    public double opseg() {
        return 2*(a+b);
    }
}

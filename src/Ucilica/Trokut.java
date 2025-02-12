package Ucilica;

public class Trokut implements IGeometrijskiLik {
    private double a;
    private double b;
    private double c;
    private String naziv = "Trokut";

    public Trokut(String naziv, double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.naziv = naziv;
    }

    public double povrsina() {
        // heronova formula, kad imam tri duzine
        double s = 0.5*(a+b+c);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double opseg() {
        return a+b+c;
    }
}

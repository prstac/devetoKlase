package Ucilica;

public class Pravokutnik {
    private int a;
    private int b;
    private String naziv = "Pravokutnik";

    public Pravokutnik(String naziv, int b, int a) {
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

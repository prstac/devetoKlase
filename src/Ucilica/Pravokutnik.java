package Ucilica;

public class Pravokutnik {
    private int a;
    private int b;
    private String naziv = "Pravokutnik";

    public Pravokutnik(int b, int a) {
        this.b = b;
        this.a = a;
    }

    public double povrsina() {
        return a*b;
    }

    public double opseg() {
        return 2*(a+b);
    }
}

package Ucilica;

public class Trokut {
    private int a;
    private int b;
    private int c;
    private String naziv = "Trokut";

    public Trokut(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

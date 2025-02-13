package Auto;

public class Auto {
    private Autos marka;
    private int topBrzina;
    private int brojVrata;
    private boolean upaljen = false;

    public Auto(Autos marka, int topBrzina, int brojVrata) {
        this.marka = marka;
        this.topBrzina = topBrzina;
        this.brojVrata = brojVrata;
    }

    public Auto(Autos marka, int topBrzina) {
        this(marka, topBrzina,  4);
    }

    public String dohvatAutomobila() {
        return "Marka automobila je " + marka + "\t" + "Top brzina: " + topBrzina + "\t" + "a broj vrata " + brojVrata;
    }


    public int getTopBrzina() {
        return topBrzina;
    }

    public void setTopBrzina(int topBrzina) {
        this.topBrzina = topBrzina;
    }

    public Autos getMarka() {
        return marka;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void paljenjeAuta() {
        upaljen = true;
        isUpaljen();
    }

    public void gasenjeAuta() {
        upaljen = false;
        isUpaljen();
    }

    public boolean isUpaljen() {
        if (upaljen) {
            System.out.println(marka + " je upaljen");
        } else {
            System.out.println(marka + " je ugasen");
        }
        return upaljen;
    }

    public void ostariGodinuDana() {
        setTopBrzina((int)Math.round(getTopBrzina() - Math.random()*10.13));
    }
}

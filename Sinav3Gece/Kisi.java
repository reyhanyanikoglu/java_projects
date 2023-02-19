package Sinav3Gece;

public class Kisi {

    protected int dogumYili;
    protected String isim;

    public Kisi(int dogumYili, String isim) {
        this.dogumYili = dogumYili;
        this.isim = isim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) {
        this.dogumYili = dogumYili;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

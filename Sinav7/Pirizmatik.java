package Sinav7;

public abstract class Pirizmatik implements Piramit {
    public String isim;
    public Konum yer;
    public double yukseklik;

    public abstract double tabanAlanHesapla(double kenar);

    public Pirizmatik(String isim, Konum yer, double yukseklik) {
        this.isim = isim;
        this.yer = yer;
        this.yukseklik = yukseklik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Konum getYer() {
        return yer;
    }

    public void setYer(Konum yer) {
        this.yer = yer;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
}

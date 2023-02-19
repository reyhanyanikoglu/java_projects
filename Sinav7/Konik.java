package Sinav7;

public class Konik  implements Piramit{

    public String isim;
    public Konum yer;
    public double yariCap;
    public  double yukseklik;
    public double yanalYukseklik;
    public  double alfaAcisi;

    @Override
    public double alanHesapla() {
        return (Math.PI*Math.pow(yariCap,2))+(Math.PI*yariCap*yanalYukseklik);
    }

    @Override
    public double hacimHesapla() {
        return ((Math.PI*Math.pow(yariCap,2)*yukseklik)/3);
    }

    public Konik(String isim, Konum yer, double yariCap, double yukseklik,
                 double yanalYukseklik, double alfaAcisi) {
        this.isim = isim;
        this.yer = yer;
        this.yariCap = yariCap;
        this.yukseklik = yukseklik;
        this.yanalYukseklik = yanalYukseklik;
        this.alfaAcisi = alfaAcisi;
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

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getYanalYukseklik() {
        return yanalYukseklik;
    }

    public void setYanalYukseklik(double yanalYukseklik) {
        this.yanalYukseklik = yanalYukseklik;
    }

    public double getAlfaAcisi() {
        return alfaAcisi;
    }

    public void setAlfaAcisi(double alfaAcisi) {
        this.alfaAcisi = alfaAcisi;
    }
}

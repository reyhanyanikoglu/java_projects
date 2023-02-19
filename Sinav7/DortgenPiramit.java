package Sinav7;

public class DortgenPiramit extends Pirizmatik {
    public double yanalYukseklik;
    public double tabanKenari;


    @Override
    public double alanHesapla() {
        return tabanAlanHesapla(tabanKenari)+((tabanKenari*4*yanalYukseklik)/2);
    }

    @Override
    public double hacimHesapla() {
        return ((tabanAlanHesapla(tabanKenari)*yukseklik)/3);
    }

    @Override
    public double tabanAlanHesapla(double kenar) {
        return kenar*tabanKenari;
    }

    public DortgenPiramit(String isim, Konum yer, double yukseklik,
                          double yanalYukseklik, double tabanKenari) {
        super(isim, yer, yukseklik);
        this.yanalYukseklik = yanalYukseklik;
        this.tabanKenari = tabanKenari;
    }

    public double getYanalYukseklik() {
        return yanalYukseklik;
    }

    public void setYanalYukseklik(double yanalYukseklik) {
        this.yanalYukseklik = yanalYukseklik;
    }

    public double getTabanKenari() {
        return tabanKenari;
    }

    public void setTabanKenari(double tabanKenari) {
        this.tabanKenari = tabanKenari;
    }
}

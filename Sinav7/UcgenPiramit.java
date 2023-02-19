package Sinav7;

public class UcgenPiramit extends Pirizmatik {
    public double yanalYukseklik;
    public double tabanKenari;


    @Override
    public double alanHesapla() {
        //taban+yanal
        return tabanAlanHesapla(tabanKenari)+((tabanKenari*3*yanalYukseklik)/2);
    }

    @Override
    public double hacimHesapla() {
        return ((tabanAlanHesapla(tabanKenari)*yukseklik)/3);
    }

    @Override
    public double tabanAlanHesapla(double kenar) {
        return ((Math.pow(3,1/2)*Math.pow(kenar,2))/4);
    }

    public UcgenPiramit(String isim, Konum yer, double yukseklik,
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

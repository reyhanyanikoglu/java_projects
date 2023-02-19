package Sinav7;

public class PiramitTest {
    public static void main(String[] args) {
        Konum koniKonum = new Konum(60,70);
        Konik koni = new Konik("Koni",koniKonum,5,10,6,60);
        System.out.println("Koni yüzey alanı : "+koni.alanHesapla());
        System.out.println("Koni konumu : "+koniKonum.toString());
        System.out.println("Koni hacim : "+koni.hacimHesapla());
        System.out.println();

        Konum ucgenPiramitKonum = new Konum(60,90);
        UcgenPiramit ucgenPiramit = new UcgenPiramit("Üçgen Piramit",ucgenPiramitKonum,15,8,9);
        System.out.println("Üçgen piramitin alanı : "+ucgenPiramit.alanHesapla());
        System.out.println("Üçgen piramit taban alanı : "+ucgenPiramit.tabanAlanHesapla(ucgenPiramit.tabanKenari));
        System.out.println("Üçgen piramitin konumu : "+ucgenPiramitKonum.toString());
        System.out.println("Üçgen piramitin hacmi : "+ucgenPiramit.hacimHesapla());
        System.out.println();

        Konum dortgenPiramitKonum = new Konum(50,90);
        DortgenPiramit dortgenPiramit = new DortgenPiramit("Kare piramit",dortgenPiramitKonum,20,15,10);
        System.out.println("Kare piramitin alanı "+dortgenPiramit.alanHesapla());
        System.out.println("Kare piramitin tabanı : "+dortgenPiramit.tabanAlanHesapla(dortgenPiramit.tabanKenari));
        System.out.println("Kare piramitin konumu : "+dortgenPiramitKonum.toString());
        System.out.println("Kare piramitin hacmi : "+dortgenPiramit.hacimHesapla());
    }
}

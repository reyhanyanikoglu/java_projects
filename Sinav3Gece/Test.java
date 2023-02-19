package Sinav3Gece;

public class Test {
    public static void main(String[] args) {

        Ders ders = new Ders("BİL1002","OOP");
        Ogrenci ogr = new Ogrenci(1991,"Fırat",ders,"14758",2021);
        System.out.println(ogr.toString());

        Ders ders2 = new Ders(null,null);
        Temsilci temsilci = new Temsilci(1752,"Fatma",ders2,"2021141074",2021,1);
        System.out.println(temsilci.toString());



    }
}

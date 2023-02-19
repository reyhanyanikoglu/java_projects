package Sinav3Gece;

public class Temsilci extends Ogrenci {

    private int sinifDuzeyi;

    public Temsilci(int dogumYili, String isim, Ders kaldigiDers, String ogrNo, int girisYili, int sinifDuzeyi) {
        super(dogumYili, isim, kaldigiDers, ogrNo, girisYili);
        this.sinifDuzeyi = sinifDuzeyi;
    }

    public int getSinifDuzeyi() {
        return sinifDuzeyi;
    }

    public void setSinifDuzeyi(int sinifDuzeyi) {
        this.sinifDuzeyi = sinifDuzeyi;
    }

    @Override
    public String toString() {
        return "Temsilci{" +
                "dogumYili=" + dogumYili +
                ", isim='" + isim + '\'' +
                ", kaldigiDers=" + kaldigiDers +
                ", ogrNo='" + ogrNo + '\'' +
                ", girisYili=" + girisYili +
                ", sinifDuzeyi=" + sinifDuzeyi +
                '}';
    }
}

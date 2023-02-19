package Sinav3Gece;

public class Ogrenci extends Kisi {

    public Ders kaldigiDers;
    protected String ogrNo;
    protected int girisYili;

    public Ogrenci(int dogumYili, String isim, Ders kaldigiDers, String ogrNo, int girisYili) {
        super(dogumYili, isim);
        this.kaldigiDers = kaldigiDers;
        this.ogrNo = ogrNo;
        this.girisYili = girisYili;
    }

    public Ders getKaldigiDers() {
        return kaldigiDers;
    }

    public void setKaldigiDers(Ders kaldigiDers) {
        this.kaldigiDers = kaldigiDers;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "dogumYili=" + dogumYili +
                ", isim='" + isim + '\'' +
                ", kaldigiDers=" + kaldigiDers +
                ", ogrNo='" + ogrNo + '\'' +
                ", girisYili=" + girisYili +
                '}';
    }
}

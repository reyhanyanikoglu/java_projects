package YemekTest;

public class Sutlac extends Yemek implements Tatli {
    @Override
    public String hazirla() {
        return "Pirinç, Süt, şeker malzemelerini karıştır pişir sonra fırına at";
    }

    @Override
    public String sekerKaristir() {
        if (malzemeKontrol(malzemeler)==true){
            return "Şekere gerek yok";
        }
        else {
            return "2 kaşık şeker ekle ve malzemeleri karıştır";
        }
    }

    public Sutlac(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String toString() {
        return "Sutlac:{" + "\n"+
                "Hazırla="+hazirla()+"\n"+
                "Porsiyon="+porsiyon+"\n"+
                "Şeker="+sekerKaristir()+"\n"+
                '}';
    }
}

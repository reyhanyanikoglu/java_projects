package YemekTest;

public class Pasta extends Yemek implements Tatli {

    public Pasta(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String sekerKaristir() {
        if (malzemeler.equals("şeker")){
            return "2 kaşık şeker ekle ve malzemeleri karıştır";
        }
        else {
            return "Şekere gerek yok";
        }
    }

    @Override
    public String hazirla() {
        return "Kakao, Süt, Yumurta, Un, Vanilya, Yağ malzemelerini karıştır ve fırına at";
    }

    @Override
    public String toString() {
        return yemekAdi+":{"+ "\n"+
                "Hazırla="+hazirla()+ "\n"+
                "Porsiyon="+porsiyon+ "\n"+
                "Şeker="+sekerKaristir()+ "\n"+
                '}';
    }
}

package GeceInterfaceSinav;

public class Pasta extends Yemek implements Tatli {

    public Pasta(int porsiyon, String malzemeler, String yemekAdi) {
        super(yemekAdi, porsiyon, malzemeler);
    }

    public String hazirla() {
        return malzemeler+" malzemelerini karıştır ve fırına at";
    }

    public String sekerKaristir() {
        String yeniMalzemeler = malzemeler.toLowerCase();
        if (yeniMalzemeler.indexOf("meyve")!=-1) {
            //burada bu metot büyük küçük farketmeden meyve malzemelerde yazıyor mu ona bakacak.
            return "Malzemeler içinde meyve var, şekere gerek yok";
        }
        else {
            return "Malzemeler içerisinde meyve yok, 2 kaşık şeker ekle ve malzemeleri karıştır.";
        }
    }
    public String toString(){
        return yemekAdi+":{"+"\n"+
                "Hazırla="+hazirla()+"\n"+
                "Porsiyon="+porsiyon+"\n"+
                "Şeker="+sekerKaristir()+"\n"+
                "}";
    }
}
package GeceInterfaceSinav;

public class Sutlac extends Yemek implements Tatli {


    public Sutlac(String yemekAdi, int porsiyon, String malzemeler) {
        super(yemekAdi, porsiyon, malzemeler);
    }

    @Override
    public String sekerKaristir() {
        return "Malzemelere 2 kaşık şeker ekle ve karıştır";
    }

    @Override
    public String hazirla() {
        return super.malzemeler+" malzemeleri karıştır pişir sonra fırına at";
    }
    public String toString(){
        return "Sütlaç:{"+"\n"+
                "Hazırla="+hazirla()+"\n"+
                "Porsiyon="+porsiyon+"\n"+
                "Şeker="+sekerKaristir()+"\n"+
                "}";
    }
}

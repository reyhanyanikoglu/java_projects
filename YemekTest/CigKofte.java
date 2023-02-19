package YemekTest;

public class CigKofte extends Yemek{
    @Override
    public String hazirla() {
        return super.malzemeler+" bu malzemeleri karıştır";
    }

    public CigKofte(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String toString() {
        return aciDurumu("Bol acılı")+"CigKofte{" + "\n"+
                "Hazırla="+hazirla()+"\n"+
                "Porsiyon="+porsiyon+"\n"+
                '}';
    }
}

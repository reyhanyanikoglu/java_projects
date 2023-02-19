package YemekTest;

public abstract class Yemek {
    public String yemekAdi;
    public String malzemeler;
    public int porsiyon;
    public boolean malzemeKontrol(String malzeme){
        if (malzemeler.equals("malzeme")){
            return true;
        }
        else {
            return false;
        }
    }
    public abstract String hazirla();
    public String aciDurumu(String aci){
        return aci;
    }

    public Yemek(String yemekAdi, String malzemeler, int porsiyon) {
        this.yemekAdi = yemekAdi;
        this.malzemeler = malzemeler;
        this.porsiyon = porsiyon;
    }
}

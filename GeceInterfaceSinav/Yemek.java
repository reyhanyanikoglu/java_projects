package GeceInterfaceSinav;

public abstract class Yemek {
    public String yemekAdi;
    public int porsiyon;
    public String malzemeler;

    public Yemek(String yemekAdi, int porsiyon, String malzemeler){
        this.malzemeler=malzemeler;
        this.yemekAdi=yemekAdi;
        this.porsiyon=porsiyon;
    }
    public String aciDurumu(String aci){
        return aci;
    }
    public boolean malzemeKontrol(String malzeme){
        if (malzemeler.indexOf(malzeme)!=-1){
            return true;
        }
        else
            return false;
    }

    public abstract String hazirla();
}
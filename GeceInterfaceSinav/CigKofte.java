package GeceInterfaceSinav;

public class CigKofte extends Yemek{
    CigKofte(String yemekAdi, int porsiyon, String malzemeler){
        super(yemekAdi,porsiyon,malzemeler);
    }
    public String hazirla(){
        return super.malzemeler+" malzemeleri karıştır ve güzelce yoğur";
    }
    public String toString() {
        return aciDurumu("Bol acılı ").concat("Çiğ köfte:{") + "\n"+
                "Hazırla="+hazirla()+"\n"+
                "Porsiyon="+porsiyon+"\n"+
                "}";
    }
}

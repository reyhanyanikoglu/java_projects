package YemekTest;

public class YemekTest {
    public static void main(String[] args) {
        Pasta pasta = new Pasta("Çikolatalı Pasta","şeker",2);
        System.out.println(pasta.toString());
        Pasta pasta1 = new Pasta("Meyveli pasta","yok",3);
        System.out.println(pasta1.toString());
        Sutlac sutlac = new Sutlac("Sütlaç","yok",4);
        System.out.println(sutlac.toString());
        CigKofte cigKofte = new CigKofte("Çiğköfte","Bulgur, Salça, İsot, Pul biber ve yağ",1);
        System.out.println(cigKofte.toString());

    }
}

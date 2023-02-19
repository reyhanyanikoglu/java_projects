package GeceInterfaceSinav;

public class YemekTest {
    public static void main(String[] args) {
        Sutlac sutlac = new Sutlac("Sütlaç",4,"Pirinç süt şeker ");
        Pasta pasta1 = new Pasta(2,"Kakao Süt Yumurta Un Vanilya Yağ","Çikolatalı pasta");
        Pasta pasta2 = new Pasta(3,"Kakao Süt Yumurta Vanilya Yağ Meyve","Meyveli pasta");
        CigKofte cigKofte = new CigKofte("Çiğköfte",1,"bulgur salça isot pul biber yağ");
        System.out.println(sutlac.toString());
        System.out.println();
        System.out.println(pasta1.toString());
        System.out.println();
        System.out.println(pasta2.toString());
        System.out.println();
        System.out.println(cigKofte.toString());
    }
}
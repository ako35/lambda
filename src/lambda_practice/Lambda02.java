package lambda_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("portakal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");

        System.out.println("ilkHarfBuyukGerisiKucukList ="+ilkHarfBuyukGerisiKucukList(list));
        System.out.println();
        System.out.println("ilkHarfEveyaColanList = " + ilkHarfEveyaColanList(list));
        System.out.println();
        yildizliYaz(list);
        System.out.println();
        System.out.println("icindeEolanList = " + icindeEolanList(list));
        System.out.println();
        lOlanlariSil(list);
        System.out.println();
        ikinciHarfeGoreSiralaIlk5ElemandanCharSayisiBuyukOlan(list);
        System.out.println();
    }

    //S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
    public static List<String>ilkHarfBuyukGerisiKucukList(List<String>list){
        return list.stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                collect(Collectors.toList());
    }

    // S2: ilk harfi e ve ya c olanlari listeleyelim
    public static List<String>ilkHarfEveyaColanList(List<String>list){
        return list.stream().filter(t->t.substring(0,1).equalsIgnoreCase("e") ||
                t.substring(0,1).equalsIgnoreCase("c")).collect(Collectors.toList());
    }

    //S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYaz(List<String>list){
        list.stream().map(t->"*"+t+"*").forEach(Utils::yazString);
    }

    //S4 : icinde e olanlardan yeni bir list olusturunuz
    public static List<String>icindeEolanList(List<String>list){
        return list.stream().filter(t->t.contains("e") || t.contains("E")).
                collect(Collectors.toList());
    }

    //S5: tum 'l' leri silelim yazdiralim
    public static void lOlanlariSil(List<String>list){
        list.stream().map(t->t.replaceAll("l","")).
                forEach(Utils::yazString);
    }

    //S6: List elemanarını 2.harfe gore sıralayıp
    //ilk 5 elemandan char sayısı en buyuk elemanı print
    public static void ikinciHarfeGoreSiralaIlk5ElemandanCharSayisiBuyukOlan(List<String>list){
        System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(1))).
                limit(5).sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                findFirst());
    }

}

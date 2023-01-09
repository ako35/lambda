package lambdastring3;

import lambdastring1.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString01 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglenceliydi");
        list.add("lambda");
        list.add("gelince");
        list.add("daha");
        list.add("da");
        list.add("cok");
        list.add("eglenceli");
        list.add("oldu");

//        for (String w:list){
//            System.out.print(w+" ");
//        }

//        elemanlariYazdir(list);

        // ilk harfi d veya c olanlari listeleyelim.
//        dVecOlanlar(list);

        // tum stringlerin basina ve sonuna yildiz koyun.
//        basinaVeSonunaYildizEkle(list);

        // alfabetik olarak siralayalim list olarak
//        System.out.println(alfabetikSiralamaYap(list));

        // tum l leri silen programi yazin.
//        lSil(list);

        // icinde e olanlardan yeni bir list olusturun.
//        System.out.println(eOlanlardanList(list));

        //

    }

    private static List<String> eOlanlardanList(List<String> list) {
        return list.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }

    private static void lSil(List<String> list) {
        list.stream().map(t->t.replaceAll("l","")).forEach(Utils::printSameLine);
    }

    private static List<String> alfabetikSiralamaYap(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    private static void basinaVeSonunaYildizEkle(List<String> list) {
        list.stream().map(t->"*"+t+"*").forEach(Utils::printSameLine);
    }

    private static void dVecOlanlar(List<String> list) {
        list.stream().filter(t->t.startsWith("d") || t.startsWith("c")).forEach(Utils::printSameLine);
    }

    private static void elemanlariYazdir(List<String> list) {
        list.forEach(t-> System.out.print(t+" "));
    }

}

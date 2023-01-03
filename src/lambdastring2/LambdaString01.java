package lambdastring2;

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

        // structured programing
//        for (String w:list){
//            System.out.println(w);
//        }

        // functional programing
//        list.forEach(t-> System.out.print(t+" "));

        // ilk harfi d veya c olanlari listeleyelim.
//        System.out.println(ilkHarfcVeyad(list));

        // tum stringlerin basina ve sonuna * ekle
//        System.out.println(basinaVesonunaYildiz(list));

        // alfabetik olarak siralayalim
//        System.out.println(alfabetikSirala(list));

        // tum l leri silelim
//        lHarfiSilme(list);

        //

    }

    private static void lHarfiSilme(List<String> list) {
        list.stream().forEach(t-> System.out.print(t.replaceAll("l","")+" "));
    }

    private static List<String> alfabetikSirala(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    private static List<String> basinaVesonunaYildiz(List<String> list) {
        return list.stream().map(t->"*"+t+"*").collect(Collectors.toList());
    }

    private static List<String> ilkHarfcVeyad(List<String> list) {
        return list.stream().filter(t->t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }

}

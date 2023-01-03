package lambdastring2;

import lambdastring1.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString02 {

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

        // icinde e olanlardan yeni bir list olusturunuz.
//        System.out.println(icindeEolanYeniList(list));

        // ilk harfini 3 kere tekrar edip yazalim
//        ilkHarf3Tekrar(list);

        // ilk harf buyuk digerleri kucuk yazalim
//        ilkHarfBuyukGerisiKucuk(list);

        // uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz.
        System.out.println(uzunlugu4ve6OlanlarHaric(list));

    }

    private static List<String> uzunlugu4ve6OlanlarHaric(List<String> list) {
        return list.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList());
    }

    private static void ilkHarfBuyukGerisiKucuk(List<String> list) {
        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1,t.length()).toLowerCase()).forEach(Utils::printSameLine);
    }

    private static void ilkHarf3Tekrar(List<String> list) {
        list.stream().map(t->t.substring(0,1).repeat(2)+t).forEach(Utils::printSameLine);
    }

    private static List<String> icindeEolanYeniList(List<String> list) {
        return list.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }

}

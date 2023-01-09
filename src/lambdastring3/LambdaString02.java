package lambdastring3;

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

        // uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz.
//        System.out.println(uzunlugu4Ve6OlanlarHaric(list));

        // tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz.
        ilkHarfBuyukDigerKucuk(list);


    }

    private static void ilkHarfBuyukDigerKucuk(List<String> list) {
        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1,t.length()).toLowerCase()).forEach(Utils::printSameLine);
    }

    private static List<String> uzunlugu4Ve6OlanlarHaric(List<String> list) {
        return list.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList());
    }
}

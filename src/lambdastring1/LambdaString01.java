package lambdastring1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString01 {

    public static void main(String[] args) {

        List<String>list=new ArrayList<>();
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
//
//        list.forEach(System.out::println);
//
//        list.forEach(w-> System.out.print(w+" "));

        // ilk harfi d veya c olanlari listeleyelim.
//        for (String w:list){
//            if (w.charAt(0)=='d' || w.charAt(0)=='c'){
//                System.out.print(w+" ");
//            }
//        }

//        System.out.println(dveCileBaslaYazdir(list));

        // tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
//        for (String w:list){
//            System.out.println("*"+w+"*");
//        }

//        basinaVeSonunaYildiz(list);

        // alfabetik olarak siralayalim
//        System.out.println(alfabetikSiralama(list));

//        Collections.sort(list);
//        System.out.println(list);

        // tum l leri silelim.
//        for (String w:list){
//            String k=w.replaceAll("l","");
//            System.out.print(k+" ");
//        }

//        lSilme(list);

        // icinde e olanlardan yeni bir list olusturunuz.
//        List<String>list1=new ArrayList<>();
//        for (String w:list){
//            if (w.contains("e")){
//                list1.add(w);
//            }
//        }
//        System.out.println(list1);

//        System.out.println(eOlanlardanListOlustur(list));

        // uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz.
//        List<String>list2=new ArrayList<>();
//        for (String w:list){
//            if (w.length()!=4 && w.length()!=6){
//                list2.add(w);
//            }
//        }
//        System.out.println(list2);

        System.out.println(uzunlugu4ve6HaricListOlustur(list));


    }
    public static List<String> uzunlugu4ve6HaricListOlustur(List<String>list){
        return list.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList());
    }


    public static List<String> eOlanlardanListOlustur(List<String>list){
        return list.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }

    public static List<String> dveCileBaslaYazdir(List<String>list){
        return list.stream().filter(t->t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }

    public static void basinaVeSonunaYildiz(List<String>list){
        list.stream().map(w-> "*"+w+"*").forEach(w-> System.out.print(w+" "));
        list.stream().map(w-> "*"+w+"*").forEach(Utils::printSameLine);
    }

    public static List<String> alfabetikSiralama(List<String>list){
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static void lSilme(List<String>list){
        list.stream().map(t->t.replaceAll("l","")).forEach(Utils::printSameLine);
    }

}

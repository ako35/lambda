package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList
                (-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        // S1:listi aralarinda bosluk birakarak yazdiriniz

        hepsiniYazdir(list);
        System.out.println();
        negatifleriYazdir(list);
        System.out.println();
        pozitifElListOlustur(list);
        System.out.println();
        pozitifCiftYazdir(list);
        System.out.println();
        pozitifVeyaCiftYazdir(list);
        System.out.println();
        listElKare(list);
        System.out.println();
        ciftKup(list);
        System.out.println();
        listElKareTekrarsiz(list);
        System.out.println();
        kucuktenBuyugeSirala(list);
        System.out.println();
        buyuktenKucugeSirala(list);
        System.out.println();
        System.out.println(pozKup5List(list));
        System.out.println();
        System.out.println(pozKare5DegilList(list));
        System.out.println();
        System.out.println(toplam(list));
        System.out.println();
        System.out.println(elToplamReference(list));
        System.out.println();
        System.out.println(elToplamReferenceInt(list));
        System.out.println();
        pozElTop(list);



    }

    public static void pozElTop(List<Integer> list) {
        System.out.println(list.stream().filter(t->t>0).reduce(0,Integer::sum));
    }
    //S14 : Listin pozitif elemanları toplamını bulalım

    public static int elToplamReference(List<Integer>l){
        int i=l.stream().reduce(0,Math::addExact);
        return i;
    }

    public static int elToplamReferenceInt(List<Integer>l){
        int i=l.stream().reduce(0,Integer::sum);
        return i;
    }


    // S13 :list elemanlarini toplamini bulalim
    public static int toplam(List<Integer> list) {
        return list.stream().reduce(0,(a,b)->a+b);
    }


    //S12: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer>pozKare5DegilList(List<Integer>list){
        return list.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=5).collect(Collectors.toList());
    }

    // S11: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer>pozKup5List(List<Integer>list){
        return list.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    //S10: listin elemanlarini buyukten kucuge siralayalim
    public static void buyuktenKucugeSirala(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t+" "));
    }

    //S9: listin elemanlarini kucukten buyuge siralayalim
    public static void kucuktenBuyugeSirala(List<Integer> list) {
        list.stream().sorted().forEach(t-> System.out.println(t+" "));
    }

    //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
    public static void listElKareTekrarsiz(List<Integer> list) {
        list.stream().map(t->t*t).distinct().forEach(t-> System.out.print(t+" "));
//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
    }


    //S7: Listin cift elemanlarının kuplerini  aynı satırda bır bosluklu yazdıralım
    public static void ciftKup(List<Integer> list) {
        list.stream().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }


    // S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım
    public static void listElKare(List<Integer> list) {
        list.stream().map(t->t*t).forEach(t-> System.out.print(t+" "));
    }


    //S5:pozitif veya çift olanları yazdırın
    public static void pozitifVeyaCiftYazdir(List<Integer> list) {
        list.stream().filter(t->t>0 || t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //S4:pozitif ve çift olanları yazdırın
    public static void pozitifCiftYazdir(List<Integer> list) {
        list.stream().filter(t->t>0 && t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //S3: pozitif olanlardan yeni bir liste olustur
    public static void pozitifElListOlustur(List<Integer> list) {
        list.stream().filter(t->t>0).forEach(t-> System.out.print(t+" "));
    }

    //S2: sadece negatif olanlari yazdir
    public static void negatifleriYazdir(List<Integer> list) {
        list.stream().filter(t->t<0).forEach(t-> System.out.print(t+" "));
    }

    public static void hepsiniYazdir(List<Integer> list) {
        list.stream().forEach(t-> System.out.print(t+" "));
    }




}

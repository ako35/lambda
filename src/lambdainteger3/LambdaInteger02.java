package lambdainteger3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 8, 1, 12, 5, 6, 9, 15, 8));

        // listede 5 den buyuk sayi var mi?
//        System.out.println(list5BuyukSayi(list));

        // peek ornegi --- negatiflerin karelerinden list olusturalim.
//        System.out.println(negatifKareList(list));
//
//        System.out.println(negatifKareList1(list));

        // listenin tum elemanlari sifirdan kucuk mu?
//        System.out.println(listElemanSifirKucukMu(list));

        // listede 100 e esit eleman yok mu?
//        System.out.println(list100EsitElemanYokMu(list));

        // listenin ilk 5 elemanini topla
        System.out.println(listIlk5ElemanTopla(list));

        System.out.println(listIlk5ElemanTopla1(list));

    }

    private static int listIlk5ElemanTopla1(List<Integer> list) {
        return list.stream().limit(5).reduce(Math::addExact).get();
    }

    private static int listIlk5ElemanTopla(List<Integer> list) {
        return list.stream().limit(5).reduce(0,(a,b)->a+b);
    }

    private static boolean list100EsitElemanYokMu(List<Integer> list) {
        return list.stream().noneMatch(t->t==100);
    }

    private static boolean listElemanSifirKucukMu(List<Integer> list) {
        return list.stream().allMatch(t->t<0);
    }

    private static List<Integer> negatifKareList1(List<Integer> list) {
        return list.stream().filter(t->t<0).peek(t-> System.out.println(t)).map(t->t*t).peek(t-> System.out.println(t)).collect(Collectors.toList());
    }

    private static List<Integer> negatifKareList(List<Integer> list) {
        return list.stream().filter(t->t<0).map(t->t*t).collect(Collectors.toList());
    }

    private static boolean list5BuyukSayi(List<Integer> list) {
        return list.stream().anyMatch(t->t>5);
    }

}

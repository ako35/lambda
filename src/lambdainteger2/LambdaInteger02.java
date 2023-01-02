package lambdainteger2;

import lambdastring1.Utils;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaInteger02 {

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>(Arrays.asList(-5,-8,-2,-12,8,1,12,5,6,9,15,8));

        // list elemanlarini sirala kucukten buyuge
//        kucuktenBuyugeSirala(list);

        // listin pozitif elemanlarinin kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim.
//        System.out.println(pozitifKupBirler5(list));

        // list elemanlarini sirala buyukten kucuge
//        System.out.println(buyuktenKucugeSirala(list));

        // list elemanlarinin toplamini bulunuz.
        System.out.println(listElemanToplami(list));


    }

    private static int listElemanToplami(List<Integer> list) {
        return list.stream().reduce(0,(a,b)->a+b);

    }

    public static List<Integer> buyuktenKucugeSirala(List<Integer>list){
        return list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static List<Integer> pozitifKupBirler5(List<Integer>list){
        return list.stream().distinct().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }

    public static void kucuktenBuyugeSirala(List<Integer> list){
        list.stream().distinct().sorted().forEach(Utils::printSameLine);
    }

}

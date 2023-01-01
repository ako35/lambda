package lambdainteger1;

import lambdastring1.Utils;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaInteger02 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));

        // listin elemanlarini kucukten buyuge siralayalim
//        Collections.sort(list);
//        System.out.println(list);

//        kucuktenBuyugeSiralama(list);

        // list elemanlarini buyukten kucuge siralayin
//        Collections.sort(list,Comparator.reverseOrder());
//        System.out.println(list);

//        buyuktenKucugeSiralama(list);

        // list pozitif elemanlari icin kupleri bulup birler basamagi 5 olanlardan yeni bir list olusturalim.
//        System.out.println(pozKupBir5(list));

//        List<String>list1=new ArrayList<>();
//        for (int w:list){
//            if (w>0){
//                String str=Integer.toString(w*w*w);
//                if (str.endsWith("5")){
//                    list1.add(str);
//                }
//            }
//        }
//        System.out.println(list1);

        // list elemanlarinin toplamini bulunuz.
//        int toplam=0;
//        for (int w:list){
//            toplam+=w;
//        }
//        System.out.println(toplam);

        System.out.println(listToplami(list));

    }

    public static int listToplami(List<Integer>list){
        return list.stream().reduce(0,(a,b)->a+b);
    }

    public static List<String> pozKupBir5(List<Integer>list){
        return list.stream().filter(t->t>0).map(t->t*t*t).map(t->t.toString()).filter(t->t.endsWith("5")).collect(Collectors.toList());
    }

    public static void buyuktenKucugeSiralama(List<Integer>list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(Utils::printSameLine);
    }

    public static void kucuktenBuyugeSiralama(List<Integer>list){
        list.stream().sorted().forEach(Utils::printSameLine);
    }

}

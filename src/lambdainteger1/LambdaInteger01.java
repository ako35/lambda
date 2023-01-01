package lambdainteger1;

import lambdastring1.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(-5,-8,-2,-12,0,1,12,5,6,9,15,8));

        // listi aralarinda bosluk birakarak yazdiriniz.
//        for (int w:list){
//            System.out.print(w+" ");
//        }

//        listYazdir(list);

        // sadece negatif olanlari yazdiriniz.
//        for (int w:list){
//            if (w<0){
//                System.out.print(w+" ");
//            }
//        }

//        negatifYazdir(list);

        // list in elemanlarinin karelerinden yeni bir list olusturalim.
//        List<Integer>list1=new ArrayList<>();
//        for (int w:list){
//            list1.add(w*w);
//        }
//        System.out.println(list1);

//        System.out.println(kareleriniYazdir(list));

        //


    }

    public static List<Integer> kareleriniYazdir(List<Integer>list){
        return list.stream().map(t->t*t).collect(Collectors.toList());
    }

    public static void negatifYazdir(List<Integer>list){
        list.stream().filter(t->t<0).forEach(Utils::printSameLine);
        System.out.println();
        list.stream().filter(t->t<0).forEach(System.out::println);
        list.stream().filter(t->t<0).forEach(t-> System.out.print(t+" "));
    }

    public static void listYazdir(List<Integer>list){
        list.stream().forEach(System.out::println);
        list.stream().forEach(t-> System.out.print(t+" "));
        System.out.println();
        list.stream().forEach(Utils::printSameLine);
    }

}

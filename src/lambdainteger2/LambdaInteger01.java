package lambdainteger2;

import lambdastring1.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>(Arrays.asList(-5,-8,-2,-12,8,1,12,5,6,9,15,8));

        // list i aralarinda bosluk birakarak yazdiriniz.
//        listYazdirma(list);

        // sadece negatifleri yazdir
//        negatifYazdirma(list);

        // list in elemanlarinin karelerinden yeni bir list olusturun.
//        System.out.println(kareList(list));




    }


    public static List<Integer> kareList(List<Integer>list){
        return list.stream().map(t->t*t).collect(Collectors.toList());
    }

    public static void negatifYazdirma(List<Integer>list){
        list.stream().filter(t->t<0).forEach(Utils::printSameLine);
    }

    public static void listYazdirma(List<Integer>list){
        list.stream().forEach(Utils::printSameLine);
        list.stream().forEach(System.out::println);
        list.stream().forEach(t-> System.out.print(t+" "));
    }

}

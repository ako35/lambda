package lambdainteger3;

import lambdastring1.Utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer>integerList= Arrays.asList(-2,-8,-5,1,2,5,6,7,15,6,8);

        // tekleri aralarinda bir bosluk birakarak yazdiralim.
//        listedekiTekSayilar(integerList);

        // ciftlerin carpimini bulalim.
//        System.out.println(ciftSayilarinCarpimi(integerList));
//
//        System.out.println(ciftSayilarinCarpimi1(integerList));

        // negatiflerin karelerinin toplami
//        System.out.println(negatifKareToplam(integerList));

        // pozitiflerin kuplerinden max olani yazdiralim.
        System.out.println(pozitifKupMax(integerList));

    }

    private static int pozitifKupMax(List<Integer> integerList) {
        return integerList.stream().filter(t->t>0).map(t->t*t*t).reduce(Math::max).get();
    }

    private static int negatifKareToplam(List<Integer> integerList) {
        return integerList.stream().filter(t->t<0).map(t->t*t).reduce(0,(a,b)->a+b);
    }

    private static int ciftSayilarinCarpimi1(List<Integer> integerList) {
        return integerList.stream().filter(t->t%2==0).reduce(1,(a,b)->a*b);
    }

    private static int ciftSayilarinCarpimi(List<Integer> integerList) {
        return integerList.stream().filter(t->t%2==0).reduce(Math::multiplyExact).get();
    }

    private static void listedekiTekSayilar(List<Integer> integerList) {
        integerList.stream().filter(t->t%2!=0).forEach(Utils::printSameLine);
    }

}

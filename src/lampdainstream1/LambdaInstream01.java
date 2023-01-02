package lampdainstream1;

import lambdastring1.Utils;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LambdaInstream01 {

    public static void main(String[] args) {

        // 1 den 30 a kadar olan sayilari 30 dahil degil siralayiniz.
//        for (int i=1;i<30;i++){
//            System.out.print(i+" ");
//        }

//        birDen30aKadarSayilariYazdir(30);

        // 20 den 100 e kadar olan sayilari 100 dahil siralayiniz.

//        yirmiDen100eKadarYazdir(20,100);

        // istenen iki deger arasindaki sayilari toplayalim 20-30

//        System.out.println(yirmiIle30ArasindakiSayilarinToplami(20, 30));

        // 30 ile 40 arasindaki sayilarin ortalamasini bulunuz.

//        System.out.println(otuzIle40ArasindakiSayilarinOrtalamasi(30, 40));

        // 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

        System.out.println(Ucyuz25ile468Arasinda8eBolunenSayisi(325, 468));

        //


    }

    private static int Ucyuz25ile468Arasinda8eBolunenSayisi(int i, int i1) {
        return (int) IntStream.rangeClosed(i,i1).filter(t->t%8==0).count();
    }

    private static Double otuzIle40ArasindakiSayilarinOrtalamasi(int i, int i1) {
        return IntStream.rangeClosed(i,i1).average().getAsDouble();
    }

    private static int yirmiIle30ArasindakiSayilarinToplami(int i, int i1) {
        return IntStream.rangeClosed(i,i1).sum();
    }

    private static void yirmiDen100eKadarYazdir(int i, int i1) {
        IntStream.rangeClosed(i,i1).forEach(Utils::printSameLine);
    }

    private static void birDen30aKadarSayilariYazdir(int a) {
        IntStream.range(1,a).forEach(Utils::printSameLine);
    }


}

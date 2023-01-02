package lampdainstream1;

import java.math.MathContext;
import java.util.stream.IntStream;

public class LambdaInstream02 {

    public static void main(String[] args) {

        // 325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim

//        System.out.println(Ucyuz25ile468Arasinda8eBolunenSayilarinToplami(325, 468));

        // 7 ile 15 dahil arasindaki tek sayilarin carpimini bulalim.

//        System.out.println(yediIle15ArasindakiTekSayilarinCarpimi(7, 15));
//
//        System.out.println(yediIle15ArasindakiTekSayilarinCarpimiMatIle(7, 15));

        // 21 den baslayan 7 nin katlarinin ilk 20 terimini toplayalim

        System.out.println(Yirmi1denBaslayan7ninKatlarininIlk20TerimininToplami(21, 20));

        System.out.println();

        int sum = 0; // Toplamı tutacak değişken
        int number = 21; // Sayımız
        for (int i = 0; i < 20; i++) {
            // 20 terim toplamak için döngü oluşturun
            if (number % 7 == 0) {
                // Sayı 7'ye tam bölünüyorsa, toplama ekleyin
                System.out.print(number+" ");
                sum += number;
            } else i--;
            number++; // Sayıyı bir artırın
        }
        System.out.println(sum); // Toplamı ekrana yazdırın

    }

    private static int Yirmi1denBaslayan7ninKatlarininIlk20TerimininToplami(int i, int i1) {
        return IntStream.rangeClosed(i,(i1-1)*7+i).filter(t->t%7==0).sum();
    }

    private static int yediIle15ArasindakiTekSayilarinCarpimiMatIle(int i, int i1) {
        return IntStream.rangeClosed(i,i1).filter(t->t%2!=0).reduce(Math::multiplyExact).getAsInt();
    }

    private static int yediIle15ArasindakiTekSayilarinCarpimi(int i, int i1) {
        return IntStream.rangeClosed(i,i1).filter(t->t%2!=0).reduce(1,(a,b)->a*b);
    }

    private static int Ucyuz25ile468Arasinda8eBolunenSayilarinToplami(int i, int i1) {
        return IntStream.rangeClosed(325,468).filter(t->t%8==0).sum();
    }


}

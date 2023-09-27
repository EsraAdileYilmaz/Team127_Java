package day10_methodOlusturma_methodOverloading;

public class C07_Runner {
    public static void main(String[] args) {

        //bu class'ta onceki class'larda hazirladigimiz methodlari method call ile
        //burada kullanmayi ogreniyoruz


        //Method call yapmak icin
        //CLASS ADI . METHOD ADI() yazilir.

        C01_SayiToplama.toplaYazdir(6.5,8.9);//Verilen iki sayinin toplami: 15.4

        C02_MaximumSayiyiBulma.enBuyukSayiyiyazdir(); // burada sayilar kullanicidan alindigi icin
                                                     //consola sayilari giriyoruz.
                                                     // parantez arasina deil
        C03_AsalSayiBulma.asalMiYazdir(79); // true

    }
}

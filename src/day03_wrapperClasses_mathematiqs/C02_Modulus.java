package day03_wrapperClasses_mathematiqs;

public class C02_Modulus {
    public static void main(String[] args) {


        /*
        % modulus bize bir sayinin bolumunden kalanini verir.KALAN SAYIYI VERIR
        sayi%10 bize sayinin birler basamagini verir
        sayi/10 sayinin birler basamagini siler. BOLUMU VERIR.
        sayi%2 bize bir sayinin cift mi tek mi oldugunu verir.
         */
        System.out.println( 85 % 6 );  // kalan=1
        System.out.println( 281357 % 10); // birler basamagini yazdiralim 7
        System.out.println( 283 % 2 ); // 283 tek mi cift mi ? 1 ==> Tek sayidir
        System.out.println( 347 % 5 ); // 347 sayisi 5 ile tam bolunur mu ? kalan 2 ==> tam bolunemez
        System.out.println( 85 / 6 ); // 14,.... ==> 14 BOLUMU VERIR
        System.out.println( 23 / 5 ); // 4,6 ==> 4 her iki degerde integer oldugu icin sonucun ondalikli kismini keser.
        System.out.println( 283 / 10 ); // 28,3 ==> 28
        System.out.println( 28 / 10 ); // 2,8 ==> 2
        System.out.println( 2 / 10 ); // 0,2 ==> 0

    }
}

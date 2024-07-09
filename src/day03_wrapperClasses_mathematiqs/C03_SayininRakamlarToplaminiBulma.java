package day03_wrapperClasses_mathematiqs;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {


        //SORU: Kullanicidan 3 basamakli pozitif bir tamsayi alip
        //      sayinin rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int birlerBas = 0 ;

        // Ornegin:girilen sayi : 257 , rakam : 0 , rakamlar toplami = 0
        birlerBas = girilenSayi % 10 ; // 257 sayisinin birler basamagi olan 7'yi aldik.
        rakamlarToplami = rakamlarToplami + birlerBas ; // 0 + 7 = 7
        girilenSayi = girilenSayi / 10; //  257 / 10 ==> 25,7 ==> 25 kaldi.Birler basamagindan kurtulduk

        // girilen sayi : 25 , rakam : 7 , rakamlar toplami = 7
        birlerBas= girilenSayi % 10 ; // 25 % 10 ==> 5'i aldik
        rakamlarToplami = rakamlarToplami + birlerBas ; // 7 + 5 ==> 12
        girilenSayi = girilenSayi / 10 ; // 25 / 10 ==> 2 kaldi.Birler basamagindan kurtulduk

        // girilen sayi : 2 , rakam : 5 , rakamlar toplami = 12
        birlerBas = girilenSayi % 10 ; // 2 % 10 ==> 2
        rakamlarToplami = rakamlarToplami + birlerBas; // 12 + 2 ==> 14
        girilenSayi = girilenSayi / 10 ; // 2 / 10 ==> 0.2 ==>0 kaldi

        System.out.println("Girilen sayinin rakamlari toplami : " + rakamlarToplami);

    }
}

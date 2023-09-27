package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        //SORU: Kullanicidan toplanmak uzere sayilar isteyin
        //      Kullanici 0'a basincaya kadar islemi tekrar ettirin
        //      Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin

        //kullanicinin kac kez sayi girecegini bilmedigimiz icin ,
        //Dongunun kac kere calisacagi belli olmayan islemlerde while loop tercih edilir

        /*
        Kullanicidan sayi aliyorsak while loop'tan once deger atamasi yapmaliyiz.
        Ancak bu deger atamasi loop'un ilk calismasini engelleyecek bir deger
        OLMAMALIDIR.bazi durumlarda atanan ilk degerin hic bir onemi yoktur
        cunku sonrasinda loop icinde yeni bir deger atamasi ile tekrarlayan donguye
        giriyor.

        Ayrica 1 kez yapilacaklar loop disinda yazilmali,
        tekrarlayan islemler loop icinde yazilmalidir.
         */


        /*
         Kullanicidan alacagimiz sayi 0 olmadigi surece kod calisacak
            loop'dan once bu sayiyi olusturmamiz gerekir ki
            while() icinde kullanabilelim

            NOT : ilk deger atamasi yaparken
                  loop'un ilk calismasini engellemeyecek bir deger atamaya
                  DIKKAT EDILMELIDIR
         */

        Scanner scanner=new Scanner(System.in);
        double sayi=1;//buraya 0 disinda her sayi yazilabilir.
        // buraya ilk atamayi 0 yapsak while loop hic calismaz.cunku 0'a basinca islem sonlandiriliyor
        double toplam=0;

        while(sayi != 0){ //sayi 0'a esit olmadigi surece dongu calisacak

            System.out.println("Lutfen toplanmak uzere sayi giriniz" +
                    "\nIslemi bitirmek icin 0'a basiniz ");
            sayi= scanner.nextDouble();
            //bunu yaptigimizda atanan bu deger (double sayi=1;)tamamen degismis oluyor. artik deger kullanici tarafindan ataniyor
            toplam +=sayi;
        }

        System.out.println("Girilen sayilarin toplami: " + toplam);
    }
}

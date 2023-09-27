package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //Soru  - Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //        bir method olusturun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ussunu hesaplamak istediginiz pozitif tam sayiyi giriniz");
        int sayi= scanner.nextInt();

        System.out.println("Lutfen hesaplanacak us degerini pozitif tam sayi olarak giriniz");
        int us= scanner.nextInt();

        usHesapla(sayi,us);


    }

    public static void usHesapla(int sayi,int us){

        //or:sayi=3 ve us=5 olsa 3*3*3*3*3 olacak

        int sonuc=1;
        int geciciUs=us;
        //bu islemi girilen us degerini korumak icin yaptik.boylece sout'da girilen us degismemis oldu.yoksa gecicius=0 oldu.

        while(geciciUs> 0){ //burada us sayisi tekrar sayisini beliliyor.
            sonuc *=sayi;
            geciciUs --;
        }
        System.out.println(sayi + " uzeri " + us + " : " + sonuc);
    }
}

package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //Soru 2- While loop kullanarak
        //        kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak icin bir sayi giriniz");
        int girilenSayi= scanner.nextInt();

        int birlerBas=0;
        int rakamlarToplami=0;
        int sayi=girilenSayi;// bu atamayi girilen sayiyi degistirmemek icin yapiyoruz. ilk atamayi biz yapmadik kullanicidan aldik.

        while (sayi > 0){ //birler basamagindan kurtulmak icin 10'a boldugumuzde sayi en son sifirlanir

            birlerBas=sayi %10; // sayinin birler basamagini al
            rakamlarToplami += birlerBas;
            sayi /= 10; //birler basamagindan kurtul

        }
        System.out.println(girilenSayi + " sayisinin rakamlar toplami: " + rakamlarToplami);


    }
}

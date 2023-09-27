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
        int rakamlarTop=0;
        int sayi=girilenSayi;// bu atamayi girilen sayiyi degistirmemek icin yapiyoruz

        while (sayi > 0){ //birler basamagindan kurtulmak icin 10'a boldugumuzde sayi en son sifirlanir

            birlerBas=sayi %10; // sayinin birler bas al
            rakamlarTop += birlerBas;
            sayi /= 10; //birler bas kurtul

        }
        System.out.println(girilenSayi + " sayisinin rakamlar toplami: " + rakamlarTop);


    }
}

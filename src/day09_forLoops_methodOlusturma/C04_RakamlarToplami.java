package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        //        rakamlar toplamini yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        //2 farkli cozom yolu var. 1.si basamak sayisi bulunup onun uzeinden gidilir
        //2. si direk sayidan gidilir


        //1. cozum yolu
        int birlerBas=0;
        int rakamlarToplami=0;
        int basamakDeg=(girilenSayi+ "").length(); // girilen sayinin kac basamakli oldugunu bulduk
        int sayi=girilenSayi; // orjinal girilen sayiyi degistirmemek icin atadik


        for (int i = 1; i <= basamakDeg; i++) {  // basamak sayisina gore loop olusturalim

            birlerBas= sayi %10;
            rakamlarToplami += birlerBas;
            sayi /=10 ; // birler basamagindan kurtulmak icin yapilir

        }

        System.out.println(girilenSayi + " sayisinin rakamlari toplami :"  +rakamlarToplami);

        System.out.println(""); // satirlar birbirine karismamasi icin yapilir

        //2. cozum yolu

        birlerBas =0;
        rakamlarToplami =0; // degerleri sifirlamazsak ustune ekleyerek artar

        for (int i = girilenSayi; i >0 ; i/=10 ) {
            birlerBas = i % 10;
            rakamlarToplami += birlerBas;
        }
        System.out.println(girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);





    }
}

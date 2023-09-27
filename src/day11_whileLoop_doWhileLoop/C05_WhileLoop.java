package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        //Soru    : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,ve yeni deger isteyin
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         	- ilk harf kucuk harf olmali
        //         	- son karakter rakam olmali
        //         	- sifre bosluk icermemeli
        //         	- uzunlugu en az 10 karakter olmali

        Scanner scanner=new Scanner(System.in);
        String sifre=" "; //soruda verilmis olan 4 sarti saglamayan bir deger girilmelidir

        while(! sifreKontrolEt(sifre)){ //girilen sifre false oldugu muddetce loop calisir

            System.out.println("Lutfen sifrenizi giriniz"); // dogru sifre girene kadar tekrarlar
            sifre= scanner.nextLine();

        }
        System.out.println("Sifreniz basariyla kaydedilmistir");

    }


    // bu class'da girilen sifreyi kontrol edip
    // girilen sifre uygun ise true, uygun degilse false donduren bir method olusturalim

    public static boolean sifreKontrolEt(String sifre){

        // flag yontemi kullanalim
        int flag = 10;

        //         	- ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf>= 'a' && ilkHarf<='z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 11;
        }


        //         	- son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            flag = 11;
        }

        //         	- sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 11;
        }

        //         	- uzunlugu en az 10 karakter olmali

        if (!(sifre.length()>=10)){ // sifre.length() < 10
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=11;
        }

        // bagimsiz if cumlelerinden sonra
        // flag ya 10 degerinde olacak ya da 11
        if (flag == 10){
            return true;
        }else {
            return false;
        }



    }
}

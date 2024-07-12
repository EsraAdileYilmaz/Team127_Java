package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C07_StringManipulations {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre=scanner.nextLine();

        //flag kullanalim. flag her turlu variable secilebilir. ancak boolean tercih edilir.
        //cunku flag da sadece 2 durum vardir. degisir yada degismez.
        boolean flag=true;

        //SARTLAR BIRBIRINDEN BAGIMSIZ OLDUGU ICIN, BAGIMSIZ IF CUMLELERI KULLANMALIYIZ

        //- ilk harf kucuk harf olmali
        char ilkHarf=sifre.charAt(0);
        if(!('a'<=ilkHarf && ilkHarf<='z')){ //ilkHarf a-z arasinda deilse
            System.out.println("ilk harf kucuk harf olmali");
            flag=false;
        }

       //- son karakter rakam olmali
      char sonKarakter=sifre.charAt(sifre.length()-1);
        if(!('0'<=sonKarakter && sonKarakter<='9')){ //sonKarakter 0-9 arasinda deilse
            System.out.println("son karakter rakam olmali");
            flag=false;
        }

        // - sifre bosluk icermemeli
        if(sifre.contains(" ")){ //sifre bosluk iceriyorsa
            System.out.println("sifre bosluk icermemeli");
            flag=false;
        }

        // - uzunlugu en az 10 karakter olmali
        if(!(sifre.length()>=10)){ // yada sifre.length()<10 ise
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=false;
        }

        // bagimsiz if cumlelerinden sonra
        // flag ya true olacak ya da false.
        if(flag == true){
            System.out.println("Sifre basariyla kaydedildi");
        }


        //2.YOL AHMET H

        /*
         // flag kullanalim
        int flag = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scanner.nextLine();
        //          - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>= 'a' && ilkHarf<='z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 11;
        }
        //          - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            flag = 11;
        }
        //          - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 11;
        }
        //          - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)){ // sifre.length() < 10
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=11;
        }
        // bagimsiz if cumlelerinden sonra
        // flag ya 10 degerinde olacak ya da 11
        if (flag == 10){
            System.out.println("sifre basariyla kaydedildi");
         */

    }
}

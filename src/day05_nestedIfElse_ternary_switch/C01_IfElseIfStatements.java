package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak
        //         “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz. \nErkek: E  Kadin: K");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);
        // kullanici harfi nasil girerse girsin, buyuk harfe cevirir


        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();

        if(yas<20 || yas>80 || !(cinsiyet=='E' || cinsiyet=='K')){
            System.out.println("Girilen bilgilerde hata var");
        } else if (cinsiyet== 'K' && yas>=60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet== 'K' && yas<60) {
            System.out.println("Kadinin emekli olmasi icin daha " + (60-yas) + " yil calismasi gerekir");
        } else if (cinsiyet=='E' && yas>=65) {
            System.out.println("Erkek emekli olabilir");
        }else {
            System.out.println("Erkegin emekli olmasi icin daha " + (65-yas) + " yil calismasi gerekir");
        }


    }
}

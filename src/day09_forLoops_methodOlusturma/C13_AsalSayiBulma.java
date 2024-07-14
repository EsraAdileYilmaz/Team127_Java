package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C13_AsalSayiBulma {
    public static void main(String[] args) {

        //SORU: Kullanicidan pozitif bir tamsayi isteyip,
        //      sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lufen pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        boolean asalMi=true;
        if (girilenSayi <=1){
            System.out.println("Bu sayi asal sayi degildir");
        }
        for (int i = 2; i <girilenSayi ; i++) {
                if (girilenSayi % i ==0){
                    asalMi=false;
                    break;
                }
        }

        if (asalMi){
            System.out.println(girilenSayi+ " bir asal sayidir");
        }else {
            System.out.println(girilenSayi+ " bir asal sayi degildir");
        }

    }
}

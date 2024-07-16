package day11_whileLoop_doWhileLoop;

import day10_methodOlusturma_methodOverloading.C05_AsalSayiMiDondur;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        //SORU: Kullanicidan bir asal sayi girmesini isteyin
        //      Kullanici asal sayi girmezse "Bu asal degil, tekrar dene" yazdirin
        //      Kullanici asal sayi girdiginde, "islem basarili olarak tamamlandi" yazdirin


        // while loop boolean sart false oldugu surece calisir
        //                    sart true olunca loop biter

        Scanner scanner=new Scanner(System.in);
        int sayi=4; //buraya asal olmayan herhangi bir ilk deger atamasi yapabiliriz.true olmasi lazim.

        //ilk deger asal olmayan bir sayi atandigi icin while () ici false oldu
        // bizde ! ekleyerek true 'ya cevirdik

        while(!(C05_AsalSayiMiDondur.asalMiDondur(sayi))){
        // asal sayi olmadigi muddetce devam eder.

            System.out.println("Lutfen asal bir sayi giriniz");
            sayi= scanner.nextInt();

            if(C05_AsalSayiMiDondur.asalMiDondur(sayi)){ //girilen sayi asal'sa, true ise
                System.out.println("islem basarili olarak tamamlandi");
            }else{ //girilen sayi asal deilse, false ise
                System.out.println("Bu asal degil, tekrar dene");
            }

        }
    }
}

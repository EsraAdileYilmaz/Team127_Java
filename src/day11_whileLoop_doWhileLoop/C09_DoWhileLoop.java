package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_DoWhileLoop {
    public static void main(String[] args) {

        // SORU: Kullanicidan toplanmak uzere sayilar isteyin
        //       Kullanici 0'a basincaya kadar islemi tekrar ettirin
        //       Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin

        Scanner scanner=new Scanner(System.in);

        int toplam=0;
        int sayi; //loop icinde kullanmak icin burda variable olusturmak gerekiyor

        do{
            System.out.println("Lutfen toplanmak uzere pozitif bir sayilar giriniz" +
                               "\nIslemi bitirmek icin 0'a basiniz");

            sayi= scanner.nextInt();
            toplam +=sayi;
        }while( sayi !=0);

        System.out.println("Girilen sayilarin toplami : " + toplam);

    }
}

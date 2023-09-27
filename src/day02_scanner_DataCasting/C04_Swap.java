package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ilk tamsayiyi giriniz");
        int sayi1=scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int sayi2=scanner.nextInt();

        System.out.println("Girdiginiz degerler: sayi1= " +sayi1+ ", sayi2= " +sayi2);

        /*
         elimizdeki sayilarin degerini kaybetmemek icin ,bos gecici bir int olusturuyoruz
          int temp=0;
         sonra ona elde edilen verilerden birini atiyoruz.sonra herbir
         sayiyi yer degistiriyoruz.

         or:kum kovasi,su kovasi, bos kova misali.
         */

        int temp=0;
        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;

        System.out.println("Degistirilen degerler:  sayi1= "+sayi1+ ", sayi2= "+ sayi2);

    }
}

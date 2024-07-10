package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // SORU:kullanicidan bir tamsayi alin
        //      sayi pozitifse 100'den buyuk veya kucuk oldugunu yazdirin,
        //      sayi negatifse tek veya cift oldugu yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi=scanner.nextInt();

        System.out.println(
                sayi>0
                ? //sayi 0'dan buyukse yazdirilacak kisim
                 sayi>100 ? "Sayi 100'den buyuk" : "Sayi 100'den kucuk"
                : //sayi negatifse sayi<0
                sayi %2 == 0 ? "Sayi cifttir"  : "Sayi tektir"
                 );

          /*
          komple yazarsak;
          System.out.println( sayi > 0 ? sayi>100 ? "Sayi 100'den buyuk" : "Sayi 100'den kucuk" : sayi %2 == 0 ? "Sayi cifttir" : "Sayi tektir");
         */
    }
}

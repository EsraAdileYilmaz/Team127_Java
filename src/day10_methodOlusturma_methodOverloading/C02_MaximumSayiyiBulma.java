package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_MaximumSayiyiBulma {
    public static void main(String[] args) {


        //SORU:  Kullanicidan method icerisinde 3 sayi alip
        //       bu 3 sayidan en buyuk olani yazdiran bir method olusturun



        enBuyukSayiyiyazdir(); //En buyuk sayi: 67.0
        /*
        burada sayilar kullanicidan alindigi icin method call esnasinda
        parantez icine sayilar yazilmadi.
         */




    }

    public static void enBuyukSayiyiyazdir(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("En buyugunu bulmak icin lutfen 3 adet sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sayi3= scanner.nextDouble();

        if(sayi1 > sayi2 && sayi1> sayi3) System.out.println("En buyuk sayi: " + sayi1);
        else if (sayi2 > sayi1 && sayi2 >sayi3) System.out.println("En buyuk sayi: " + sayi2);
        else if (sayi3 > sayi1 && sayi3 >sayi2) System.out.println("En buyuk sayi: " + sayi3);
        else System.out.println("En buyuk sayiyi bulamadim");




    }
}

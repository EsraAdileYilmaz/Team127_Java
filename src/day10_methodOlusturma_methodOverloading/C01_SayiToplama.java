package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_SayiToplama {
    public static void main(String[] args) {

        // Verilen iki sayiyi toplayip,sonucu yazdiran bir method olusturun

        toplaYazdir(4,7); //Verilen iki sayinin toplami:11.0
        toplaYazdir(5,6.4); //Verilen iki sayinin toplami: 11.4


        //SORU: kullanicidan 2 sayi alip sonucu bize yazdiran bir method olusturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif iki sayi giriniz");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        toplaYazdir(sayi1,sayi2);




    }// main method sonu


    public static void toplaYazdir(double sayi1,double sayi2){

        System.out.println("Verilen iki sayinin toplami: " + (sayi1 +sayi2));
    }

}// class sonu

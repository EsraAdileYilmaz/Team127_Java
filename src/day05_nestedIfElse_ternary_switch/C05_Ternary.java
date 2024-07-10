package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        //SORU: kullanicidan bir pozitif tamsayi alin
        //      sayinin cift veya tek oldugunu yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        // sorunun if-else ile cozumu
        if(sayi %2 == 0){
            System.out.println("sayi cifttir");
        }else {
            System.out.println("sayi tektir");
        }

        // sorunun ternary ile cozumu
        System.out.println(sayi %2 ==0 ? "sayi cifttir" : "sayi tektir");

        //SORU: sayi 100'den buyukse sayiyi 2 katina cikarin,
        //      100'den buyuk degilse degerini 10 artirin

        sayi= sayi>100 ? sayi*2 : sayi+10;
        System.out.println("Ternary'den sonra sayi: " + sayi);


        // SORU:sayinin yeni hali 100'den buyukse "sayi zaten buyuk" yazdirin
        //      yeni hali 100'den buyuk degilse sayiyi 2 katina cikarin

        System.out.println(sayi>100 ? "Sayi zaten buyuk" : sayi*2);//Bu satir sadece yazdirir ama atama yapmaz


        // sadece yazdirma veya sadece atama olan sorularda ternary kullanilabilir
        // ama ikisi farkli islemler oldugunda kullanisli olmaz
        // bu soruda 2 katini yazdirdi ama soruda atama istiyordu, yapmadi.

        if (sayi>100){
            System.out.println("Sayi zaten buyuk");
        }else {
            sayi=sayi*2;
        }//if-else ile cozumu tam olarak yapilabilir


    }
}

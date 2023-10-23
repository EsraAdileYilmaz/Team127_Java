package day29_exceptions_garbageCollector;

import java.util.Scanner;

public class C05_throwKeyword {
    public static void main(String[] args) {

        int sayi=-5;

        //sayi negatifse asagidaki ilk 3 satir calismasin.

        try {

            if(sayi<0) throw new RuntimeException("sayi sifirdan kucuk");
            //sayi sifirdan kucukse RuntimeException firlat
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        System.out.println(4);
        System.out.println(5);


        //SORU:Kullanicidan yasini isteyin,
        //yasini negatif girerse exception firlatin
        //ve hic bir islem yapmayin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scanner.nextInt();

        try {
            if(yas < 0){
                throw new IllegalArgumentException("Yas negatif olamaz");
                //yas sifirdan kucukse IllegalArgumentException firlat
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();//bununla detayli hata raporu aliyoruz.
        }
        //java.lang.IllegalArgumentException: Yas negatif olamaz
        //	at day29_exceptions_garbageCollector.C05_throwKeyword.main(C05_throwKeyword.java:37)
        //calismaya devam ediyor. Process finished with exit code 0


    }
}

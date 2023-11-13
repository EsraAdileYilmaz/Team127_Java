package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        /*
         Bir kod yazarken
            olasi risk durumlarini analiz etmek
            ve bu riskler gerceklesirse ne yapacagini Java'ya soylemek
            iyi bir kod yazarinin gorevidir.

            Java'da ongorulen bir hatayi
            exception olusmadan cozmek icin (handle etmek icin)
            try-catch/finally bloklari kullanilir.
            Sirasiyla;
            1- hatanin olusabilecegi satirlari bir try blog'unun icine alin
            2- olasi exception'i catch (olasiExceptionAdi exceptioniKaydedecegimizObje)
               seklinde yaz
            3- exception olusmasi durumunda calismasini istedigimiz kodu
               catch() { catch blogu} na yaz

             Eger birden fazla olasi exception varsa;
             1- ic ice try-catch bloklari olusturabiliriz,
             2- bir try birden fazla catch yazabiliriz,
             3- Eger tum olasi exception'lari kapsayan bir exception varsa
                tek catch ile genis kapsamli exception yazilabilir.
                Bu durumda hatayi spesifik olarak bilemeyecegimiz icin
                hata mesajini da genel vermeliyiz.
         */

        //SORU:kullanicidan iki tamsayi alin
        //     ilk sayiyi ikinciye bolup yazdirin

        Scanner scanner = new Scanner(System.in);

       /*1- ic-ice try-catch
        try {//ic ice try methodu

            try {//once burayi yap
                System.out.println("Lutfen iki tamsayi giriniz");
                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt();

                System.out.println("Sayilarin bolumu: " + sayi1 / sayi2);

            } catch (ArithmeticException e) {//problem cikarsa bunu yap
                System.out.println("ikinci sayi 0 olamaz");
            }


        } catch (InputMismatchException f) {
            System.out.println("Tamsayi girmelisiniz");
        }

        */


       /* 2-bir try birden fazla catch
        try{
            System.out.println("Lutfen iki tamsayi giriniz");
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();

            System.out.println("Sayilarin bolumu: " + sayi1 / sayi2);
        }catch (ArithmeticException e){//ArithmeticException hatasini yakala e variable'ina kaydet
            System.out.println("ikinci sayi 0 olamaz");
        }catch (InputMismatchException f){//InputMismatchException hatasini yakala f variable'ina kaydet
            System.out.println("Tamsayi girmelisiniz");
        }

        */


        //3- Eger tum olasi exception'lari kapsayan bir Exception varsa;
        System.out.println("Lutfen iki tamsayi giriniz");
        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();

            System.out.println("Sayilarin bolumu: " + sayi1 / sayi2);
        } catch (Exception e) {//Exception tum exceptionlarin parent'idir.
           // throw new RuntimeException(e); burayi silebiliriz cunku yukarda Exception ile genel bir hata raporu olustu
            System.out.println("Hatali giris yaptiniz");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();//hatanin tum raporunu yazdirdi.hata takibini daha rahat yapariz.
            /*
            java.util.InputMismatchException
	        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	        at java.base/java.util.Scanner.next(Scanner.java:1594)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	        at day28_exceptions.C03_Exceptions.main(C03_Exceptions.java:81)
             */
            //Exception tum hata tiplerini yakalar.ve kodumuz calismaya devam eder.
        }

        /*
            catch() icinde yazdigimiz e
            yakalanan exception'in kaydedildigi obje olacaktir.

            Eger exception ile ilgili daha detayli bilgi almak istersek;
            e objesi kullanilarak
            hatanin detayi yazdirilabilir.

            ornegin : e.printStackTrace(); asagidaki detayli hata raporunu yazdirir
            java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            at java.base/java.util.Scanner.next(Scanner.java:1594)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at day28_exceptions.C03_Exceptions.main(C03_Exceptions.java:78)

            e.getMessage() ;  bize null veya / by zero  yazdirdi

            e.toString() ; bize java.lang.ArithmeticException: / by zero yazdirdi
         */




    }
}

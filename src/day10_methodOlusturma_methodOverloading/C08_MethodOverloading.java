package day10_methodOlusturma_methodOverloading;

public class C08_MethodOverloading {

    public static void main(String[] args) {

         /*
            Bir Method Call yapildiginda
            Java hangi method'un calisacagina karar vermek icin
            asagidakileri kontrolleri yapar;

            1- Methodun ismini kontrol eder
            2- Argument sayisi ile parametre sayisi ayni olmalidir.Bunu kontroleder
            3- Argument olarak yazilan DEGERlerin data turu  ile PARAMETRElerin data turunun uyumlu olmasini kontrol eder

            devami C10'da
         */

        toplama(8,9); //Verilen iki int sayinin toplami: 17
        toplama('c','d');//Verilen iki int sayinin toplami: 199 (burada char matematisel isleme
                         //girince degerlerini ASCII tablosundan alir)

       // toplama(4.5,7.9);  BUNU kabul etmez. cunku degerler int cinsinden deil




    }

   // verilen iki integer sayiyi toplayip yazdiran bir method olusturun

    public static void toplama(int sayi1 , int sayi2){
        System.out.println("Verilen iki int sayinin toplami: "+ (sayi1+sayi2));
    }
}

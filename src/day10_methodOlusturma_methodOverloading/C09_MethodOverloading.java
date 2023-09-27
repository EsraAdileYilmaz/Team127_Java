package day10_methodOlusturma_methodOverloading;

public class C09_MethodOverloading {
    public static void main(String[] args) {

         /*
            Bir class'da ayni isim ve esit sayida parametre ile
            birden fazla method olusturulabilir mi ?

            Parametrelerin data turleri ayni olmazsa
            birden fazla ayni isimde method olusturulabilir.

            Java'da method ismi ve parametrelerin data turleri birlikte kullanilarak
            method signature olusur.
            METHOD SIGNATURE= ISIM + DATA TURU
            or:toplama int int
               toplama int double

            Method signature'i farkli olmak uzere
            bir class'da istediginiz kadar
            ayni isimde method olusturabilirsiniz

            Buna METHOD OVERLOADING denir.

         */
        toplama(67,87); //Iki int sayinin toplami : 154
        toplama(4.7,76); //double ve int turundeki 2 sayinin toplami : 80.7
        toplama(43,7.8); //int ve double turundeki 2 sayinin toplami : 50.8


        // Methodlarimiz ayni isimde fakat signature'leri farkli.
        //1. methodumuzun signature= toplama int int
        //2. methodumuzun signature= toplama int double
        //3. methodumuzun signature= toplama double int




    }

    public static void toplama(int sayi1 , int sayi2){ //1. methodumuz
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }


    public static void toplama(int a , double b){ //2. methodumuz
        System.out.println("int ve double turundeki 2 sayinin toplami : " + (a+b));
    }

    public static void toplama(double a , int b){ //3. methodumuz
        System.out.println("double ve int turundeki 2 sayinin toplami : "  + (a+b));
    }
}

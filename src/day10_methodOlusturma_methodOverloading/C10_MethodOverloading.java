package day10_methodOlusturma_methodOverloading;

public class C10_MethodOverloading {

    public static void main(String[] args) {

         /*
            Bir Method Call yapildiginda
            Java hangi method'un calisacagina karar vermek icin
            asagidakileri kontrolleri yapar;

            1- Methodun ismini kontrol eder
            2- Argument sayisi ile parametre sayisi ayni olmalidir.Bunu kontroleder
            3- Argument olarak yazilan DEGERlerin data turu  ile PARAMETRElerin data turunun uyumlu olmasini kontrol eder
            4- Eger argument ve parametrelerin data turu %100 uyumlu olmazsa, casting yapar
              ve minumun sayida casting ile calistirabilecegi method'u tercih eder
         */

        toplama(5,7); //double ve int 2 sayinin toplami : 12.0
        //Java burada 1 tane casting yapti.buyuzden ilk methodu kullandi
        //Eger 2. methodu kullansaydi 2 tane casting yapmak zorunda kalacakti.



    }

    public static void toplama(double a , int b){ // toplama double int
        System.out.println("double ve int 2 sayinin toplami : " + (a+b));
    }

    public static void toplama(double a , double b){ // toplama double double
        System.out.println("double ve double 2 sayinin toplami : " + (a+b));
    }
}

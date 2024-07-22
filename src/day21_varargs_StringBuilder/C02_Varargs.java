package day21_varargs_StringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        /*
        Method call() sirasinda istedigim kadar argument yazabilmek istiyorsam;
        Java -> variety of arguments(Varargs) kullanir.
        Varargs array alt yapisini kullanarak,
        istedigimiz kadar argument yazmamiza imkan tanir.

        Varargs argumentle parametre arasindaki gecisi saglar.
        Bunun icin tum argumentlerin parametre ile ayni data turunden olmasi gerekir.
        Varargs Array alt yapisini kullanir.
      */
        topla(4,9);//Toplam : 13
        topla(3,5,7);//Toplam : 15
        topla(2);//Varargs ile toplam: 2
        topla(2,5,9,1,3,5,7,1,3,4);//Varargs ile toplam: 40
        topla(1,2,3,4,5,6);//Varargs ile toplam: 21
        topla(1,2,3,4,5,6,7,8);//Varargs ile toplam: 36
        topla(3,4,5,6,7);//Varargs ile toplam: 25


    }

    public static void topla(int... sayi){

        int toplam=0;
        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println("Varargs ile toplam: "+toplam);

    }

    public static void topla(int sayi1, int sayi2){

        System.out.println("Toplam : "+(sayi1+sayi2));

    }

    public static void topla(int sayi1, int sayi2, int sayi3){

        System.out.println("Toplam : "+(sayi1+sayi2+sayi3));

    }
}

package day27_abstractClasses_interfaces;

public interface I08_Interface {

      /*
        1- Interface'ler full abstraction saglar.
        2- full abstraction sagladigi icin yazsak da yazmasak da
           tum method'lar= public ve abstract'tir.
        3- Interface'de olusturulan her variable
           yazsak da yazmasak da
           public,final ve static'tir.
        4-Interface'lerin constructor'i yoktur.

     */

    public final static int sayi1 = 20;
    final int sayi2 = 10;
    static String isim = "Ali Can";
    //her bir variable public-final-static oldugu icin bunlar griye boyandi.yani java yazmana gerek yok diyor.



    public abstract void method1();
    public void method2();
    abstract int method5();
    String method4();

    public static void main(String[] args) {

        //sayi1=30; final oldugu icin sonradan deger atanamaz

    }


}

package day12_scope;

public class C05_BaskaClassdanErisim {

       /*
        Class icerisinde olusturdugumuz class uyelerinin
        static olup olmamasi
        baska class'lardan erisimi de etkiler.

        Baska class'dan static bir class uyesine ulasmak icin
        classIsmi.staticClassUyesiIsmi  kullanilir.

        Baska class'dan static olmayan class uyesine ulasmak icin
        Once o class'dan bir obje olusturup
        sonra objeIsmi.staticOlmayanClassUyesiIsmi kullanilir.

        PEKIII static bir class uyesine
        OBJE uzerinden ulasabilir miyiz ?

        Java obje ismini yazip nokta koyunca
        static uyeleri otomatik olarak onermez
        AMMA biz manuel olarak obj.staticClassUyeIsmi yazarsak
        java istedigimiz static uyeyi getirir
        bu durumda intelliJ bu kullanimi sariya boyar
        static bir class uyesine, static olmayan yolla erisiyorsun
        diye bizi uyarir ama calismaya engel olmaz
     */

    public static void main(String[] args) {

        System.out.println(C03_Scope_ClassVariables.bl); // true (class 3 teki static variable)
        System.out.println(C03_Scope_ClassVariables.chr); // a (class 3 teki static variable)
        C03_Scope_ClassVariables.staticMethod(); // class 3 teki static method

        C03_Scope_ClassVariables obj = new C03_Scope_ClassVariables();//static olmayanlara ulasmak icin classtan obje olusturulur
        System.out.println(obj.sayi); // 23
        System.out.println(obj.str); // Java
        obj.staticOlmayanMethod();

        System.out.println(obj.bl); // true
        System.out.println(obj.chr); // a

        //Olusturulan obje ile hem static variable'lari, hem static olmayan variable'lari,
        //hemde static olmayan methodlari kullanabiliriz.


    }
}

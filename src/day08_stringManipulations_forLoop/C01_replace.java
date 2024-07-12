package day08_stringManipulations_forLoop;

public class C01_replace {
    public static void main(String[] args) {

        //replace() methodunda degistirilecek elemani ve yeni degeri
        //yazdigimizda String icinde buldugu tum degisecek elemanlari
        //yeni degerle degistirir.
        //Bu method char kabul eder.

        String str="Java candir";

        System.out.println(str.replace('a', 'q')); //Jqvq cqndir
        //tum a'lar q'ya donustu

        System.out.println(str.replace("Java", "Tava"));// Tava candir

        //degistirilecek elemanlarin uzunluklari farkli olabilir
        System.out.println(str.replace("Java", "X")); // X candir

        // x ve y'yi bulamadigi icin bir degisiklik olmadi.
        System.out.println(str.replace("x", "y")); // Java candir

        //String methodlari yan yana eklenebilir.Ancak birden fazla degisiklik yapacaksak
        //ilk degisiklik sonraki degisiklikleride etkiler.
        System.out.println(str.replace("a", "e").replace("i", "a"));
        // Jeve cendar

        System.out.println(str.replace("i", "a").replace("a", "e"));
        // Jeve cender

        // replaceFirst() methodunda degisecek elemanin ilk buldugu indextekini
        // degistirir, gerisiyle ilgilenmez.
        // degisecek metin sadece ilk deger icin degissin diyorsak
        // replace() yerine replaceFirst() kullanilir
        System.out.println(str.replaceFirst("a", "x")); // Jxva candir


        // regex : regular expressions : belirlenmis kisaltmalar
        // ilk harfi * yapalim
        System.out.println(str.replaceFirst("\\w", "*"));// *ava candir

        // varsa ilk string icindeki ilk rakami + yapalim
        str = "Java 44Candir";
        System.out.println(str.replaceFirst("\\d", "+")); // Java +4Candir



    }
}

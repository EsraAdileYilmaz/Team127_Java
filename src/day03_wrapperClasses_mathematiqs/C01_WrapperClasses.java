package day03_wrapperClasses_mathematiqs;

public class C01_WrapperClasses {
    public static void main(String[] args) {


        int sayi = 20;
        String str = "Java";
        Integer sayi2 = 30;
        sayi = sayi2; //primitive ile wrapper classlar arasinda deger atamasi sorunsuz olarak yapilir.
        sayi2 = sayi;

        char chr1 = 'j';
        Character chr2 = chr1;

        Boolean bl = true;
        Short shr =3;
        Double dbl = 3.5;
        Float flt = 2.3f;
        /*
        1) primitive data turleri ile o turun wrapper class'i arasinda gecis kolay ve mumkundur.
         birbirine sorunsuz olarak deger atamasi  yapilabilir.

         2)Wrapper classlarin hazir methodlari vardir. ayni non-primitivler gibi.
         */

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Short.MIN_VALUE); // -32768

        String str1 = "34";
        String str2 = "45";
        // str1 ve str2 nin degerlerini matematiksel olarak toplayin
        System.out.println(str1 + str2); // 3445
        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); // 79
        str1 = "34a";
        str2 = "23";
        // System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2))); HATA VERIR
        // NumberFormatException

        chr1 = 'a';
        System.out.println(Character.isDigit(chr1)); // false (isDigit=sayi mi?)
        System.out.println(Character.isLetter(chr1)); // true (isLetter=kelime mi?)
        System.out.println(Character.toUpperCase(chr1)); // A (Buyuk harfe cevir)


        // int olarak verilen bir sayiyi, String'e nasil ceviririz ?
        // hiclik + (""+) ekleyerek int sayiyi string'e ceviririz.

        String metin = 23 + "";
        System.out.println(metin);
    }
}

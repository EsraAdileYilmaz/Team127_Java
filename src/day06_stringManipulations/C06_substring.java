package day06_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        // substring() methodu stringin icinden belli bir kismi almak
        //icin kullanilir

        String str = "Java en guzel programlama dili";

        System.out.println(str.substring(5)); //en guzel programlama dili
        System.out.println(str.substring(0));//Java en guzel programlama dili
        System.out.println(str.substring(1));//ava en guzel programlama dili

        //son 4 karakteri yazdirin
        System.out.println(str.substring(str.length()-4));//dili

        //metnin icindeki sadece java yazisin yazdirin
        System.out.println(str.substring(0,4));//Java

        /*
         2 SEKILDE DUSUNULEBILIR:
         0.index'den basla 4 karakter yazdir
         veya
         0.index(dahil) ile 4. index(haric) arasi
         */

        //  cumledeki 2.space'in index'i 7 ise
        // 2.space'den sonraki 5 harfi yazdirin
        System.out.println(str.substring(8,13));//guzel

        // tek bir harf almak icin
        System.out.println(str.substring(0,1)); //J 0.index'deki karakteri
        System.out.println(str.substring(3,4)); //a 3.index'deki karakteri

        //6. indexdeki harfi String olarak kaydedin
        String index6dakiHarf=str.substring(6,7);
        System.out.println(index6dakiHarf); //n

        //baslangic indexi ve bitis indexi ayni olursa
        System.out.println("bas indexi ve bitis indexi ayni olursa:"+ str.substring(5,5)+"---");
        // "" hiclik dondurur

        // System.out.println(str.substring(5,2)); Java geriye gitmez
        // StringIndexOutOfBoundsException: begin 5, end 2, length 30

    }
}

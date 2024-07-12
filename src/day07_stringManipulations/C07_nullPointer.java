package day07_stringManipulations;

public class C07_nullPointer {
    public static void main(String[] args) {

        //null pointer bir deger deil, isaretcidir

        String str;
        // System.out.println(str);
        // Java'da main method icerisinde deger atamadan bir variable olusturabiliriz
        // ANCAK deger atamadan kullanamayiz


        String str2 = "";
        System.out.println(str2); // hiclik yazdirir. consolda bos bir satir olusur
        // str2'yi kullanabilmek icin hiclik degeri atayabiliriz
        // Ancak hiclik degeri atanan variable'lari
        // Java deger atanmamis olarak siniflandirmaz
        // deger atananlar grubuna koyar.
        /*
            java deger atanmamis variable'lari isaretlemek icin
            ozel olarak null keyword'unu olusturmustur.
            Asagidaki ornekte
            str4'e hiclik degeri atanmistir
            str5'e Tava degeri atanmistir
            str3 ise null olarak ISARETLENMISTIR

            null bir deger degil ISARETCIDIR
            str3'un olusturuldugunu ve bir deger atanana kadar
            bu sekilde kullanilmak istendigini Java'ya soyler.

            null olarak isaretlenen bir String'i
            yazdirabilirsiniz,
            ancak method'larda kullanamazsiniz.
            method() lar null ile KULLANILAMAZ.
         */
        // String str3 = true; Stringe boolean bir deger ATAYAMAZSINIZ
        // String str3 = 45 ;  Stringe integer bir deger ATAYAMAZSINIZ
        // String str3 = 'f';  Stringe char bir deger ATAYAMAZSINIZ
        
        String str3 = null ;
        String str4 = "";
        String str5 = "Tava";
        System.out.println(str3); // null
        // System.out.println(str3.isBlank()); // NullPointerException
        // System.out.println(str3.substring(0, 1)); // NullPointerException
        // System.out.println(str3.charAt(0)); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException
        System.out.println(str3 == null); // true
    }
}

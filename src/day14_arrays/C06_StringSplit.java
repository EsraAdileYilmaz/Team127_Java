package day14_arrays;

import java.util.Arrays;

public class C06_StringSplit {
    public static void main(String[] args) {

        /*
        split() methodu ile verilen bir string'i
        array'e ceviriyoruz.yani string bir variable
        string bir array'e donusuyor.

        split() methodunda parantez icine yazilan regex veya deger
        string variable'da bulunur.bunlar silinir ve yerine (, )birakilarak
        buralardan ayrilir.
         */

        //asagidaki arama sonuc sayisinin 1 milyondan cok oldugunu test edin.
        String str = "About 197.000.000 results (0,43 seconds) ";

        //1.adim:String'i split() methodu ile kelime kelime ayirip,
        //ayrilan bu string'i olusturacagimiz bir array'e
        //atayalim.
        String [] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        //Yeni olusan array= [About, 197.000.000, results, (0,43, seconds)]


        //2.adim:Olusturulan array'in 1.indexi olan kismi diger ogelerden
        //temizleyelim.buda replaceAll() methodu ile yapalim.
        kelimeler[1].replaceAll("\\D",""); // burda sayilar disindakilerden kurtulduk.


        //3.adim:bunu birde int'a donusturmeliyiz.parseInt() methodu ile yapalim.
        int sonucSayisi=Integer.parseInt(kelimeler[1].replaceAll("\\D",""));
        System.out.println(sonucSayisi);//197000000 istedigimiz sayiyi elde etmis olduk.


        //split() methodu ile farkli ornekler yapalim
        String [] ayiracE=str.split("e");
        System.out.println(Arrays.toString(ayiracE));
        //[About 197.000.000 r, sults (0,43 s, conds) ]  e'lerin yerine (, ) geldi.


        String [] ayiracHiclik=str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));
        //[A, b, o, u, t,  , 1, 9, 7, ., 0, 0, 0, ., 0, 0, 0,  , r, e, s, u, l, t, s,  , (, 0, ,, 4, 3,  , s, e, c, o, n, d, s, ),  ]



        String [] ayiracVirgul=str.split(",");
        System.out.println(Arrays.toString(ayiracVirgul));
        //[About 197.000.000 results (0, 43 seconds) ]  virgulden ayirdi





    }
}

package day30_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue {

    public static void main(String[] args) {

        /*
        Queue'nun methodlari=
        1)add() sona element ekler.
        2)remove() elementleri bastan baslayarak siler
        3)element() methodu queue'nun ilk elemanini silmeden bize getirir.bulamazsa exception firlatir
        4)peek() methodu queue'nun ilk elemanini silmeden bize getirir.bulamazsa null dondurur
        5)offer() methodu eger kapasite sinirlamasi yoksa, verdigimiz elementi queue'nun sonuna ekler
        6)poll() methodu Queue'nun ilk elementini siler ve bize dondurur.bulamazsa null dondurur

        **add() methodu ile offer() methodu arasindaki fark=
        add() methodu verilen elementi sona her halukarda eklerken,
        offer() methodu kapasite uygunsa elementi sona ekler.

         */

        Queue <String> harfler=new LinkedList<>();
        //Queue interface'inin ozelliklerini alan bir obje olusturduk.
        harfler.add("y");
        harfler.add("K");
        harfler.add("M");
        harfler.add("s");
        System.out.println(harfler);//[y, K, M, s]

        System.out.println(harfler.remove());//y (ilk indextekini siler)
        System.out.println(harfler);//[K, M, s]
        //tekrar remove() yapsak K silinir.Yani silme islemi bastan sona dogru yapilir
        //tekrar remove() yapsak M silinir
        //tekrar remove() yapsak s silinir.Sirayla siliyor.

        harfler.add("M");
        harfler.add("M");

        System.out.println(harfler.remove("M"));//true (yani M'yi buldum,sildim)
        System.out.println(harfler);//[K, s, M, M] ilk buldugu M silindi

        //element() methodu Queue'nun ilk elemanini silmeden bize getirir.bulamazsa exception firlatir
        System.out.println(harfler.element());//K
        System.out.println(harfler);//[K, s, M, M]

        //peek() methodu Queue'nun ilk elemanini silmeden bize getirir.bulamazsa null dondurur
        System.out.println(harfler.peek());//K
        System.out.println(harfler);//[K, s, M, M]

        //element() method ile peek() method arasindaki fark, bos bir Queue'da kullanildiginda gorulur.
        Queue <String> deneme=new LinkedList<>();//[]
        //System.out.println(deneme.element());//NoSuchElementException (boyle bir element yok)
        System.out.println(deneme.peek());//null

        // offer() methodu eger kapasite sinirlamasi yoksa, verdigimiz elementi Queue'ya ekler
        System.out.println(harfler.offer("Z"));//sona ekleme yapti
        System.out.println(harfler);//[K, s, M, M, Z]


        // poll() methodu Queue'nun ilk elementini siler ve bize dondurur.list bossa null dondurur
        System.out.println(harfler.poll());//K
        System.out.println(harfler);//[s, M, M, Z]

    }
}

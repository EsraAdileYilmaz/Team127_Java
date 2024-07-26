package day30_iterator_collections;

import java.util.*;

public class C03_LinkedList {

    public static void main(String[] args) {

        /*
            LinkedList birden fazla Interface'i implement ettigi icin,
            implement ettigi Interface'ler data turu olarak secilebilir
            ve hangi Interface'i data turu secersek
            LinkedList o data turunun sahip oldugu ozellikleri tasir.

            Eger data turu ve constructor LinkedList secilirse
            implement ettigi List, Queue ve Deque interface'lerindeki
            tum ozellikleri tasiyacaktir.
         */

        LinkedList <String> ll1=new LinkedList<>();

        Queue <String> ll3=new LinkedList<>();

        Deque <String> ll4= new LinkedList<>();

        List<Integer> ll2=new LinkedList<>();
        // Eger data turu olarak List<> secilirse,
        // bizim simdiye kadar kullandigimiz ArrayList<> ile ayni ozelliklere sahip olur.

        ll2.add(4);
        ll2.add(5);
        ll2.add(8);

        System.out.println(ll2);//[4, 5, 8]

        ll2.add(1,9);
        System.out.println(ll2);//[4, 9, 5, 8]

        System.out.println(ll2.get(2));//5  (2.indexteki elementi getirir)

        System.out.println(ll2.remove(1));//9 (1.indexteki elementi siler yani 9'u siler)
        System.out.println(ll2);//[4, 5, 8]

        //Ama element olarak 8'i silmek icin, once bir variable'a 8'i atamamiz lazim.
        //sonra onu remove() methodu ile sileriz.
        Integer silinecekSayi= 8;
        System.out.println(ll2.remove(silinecekSayi));//true (yani bu elementi buldum,sildim)
        silinecekSayi=12;
        System.out.println(ll2.remove(silinecekSayi));//false (yani bu elementi bulamadim,silemedim)
        System.out.println(ll2);//[4, 5]


        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);
        System.out.println(list);//[4, 6, 9, 10]

        System.out.println(list.retainAll(ll2));//true
        System.out.println("ll2 : "+ll2);//ll2 :[4, 5] hicbir degisiklik olmadi
        System.out.println("list : "+list);//list :[4] bu list tamamen degisti.sadece her iki list icinde ortak olan eleman kaldi

        /*
            retainAll() methodu iki list uzerinde yapilir.
            retainAll() methodu ortak elemanlar disindakileri siler
            iki listin ortak elemanlarina (kesisim elemanlari) bakilir.
            ilk listte sadece ortak elemanlar kalir,gerisi silinir.KALICI OLARAK SILINIR.
            ikinci listte ise hicbir degisiklik olmaz.
            ornegin;System.out.println(list.retainAll(ll2));
            list'den ll2'da olmayan elemanlari siler.
            Eger herhangi bir elemani silerse true,
            hic bir elemani silemezse false doner.
         */

        list.add(6);
        list.add(9);
        list.add(10);
        System.out.println(list.removeAll(ll2));
        System.out.println("ll2 :"+ll2);//ll2 :[4, 5]
        System.out.println("list :"+list);//list :[6, 9, 10] icindeki her iki list'te bulunan ortak elemanlar (yani 4 u) silindi.

        // retainAll() ortak elemanlar disindakileri siler
        // removeAll() ortak elemanlari siler



    }
}

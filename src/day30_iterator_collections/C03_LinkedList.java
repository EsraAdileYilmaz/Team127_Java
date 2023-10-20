package day30_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

        List<Integer> ll2=new LinkedList<>();
        // Eger data turu olarak List<> secilirse
        // bizim simdiye kadar kullandigimiz ArrayList<> ile ayni ozelliklere sahip olur


        Queue <String> ll3=new LinkedList<>();

        Deque <String> ll4= new LinkedList<>();

        ll2.add(4);
        ll2.add(5);
        ll2.add(8);

        System.out.println(ll2);//[4, 5, 8]

        ll2.add(1,9);
        System.out.println(ll2);//[4, 9, 5, 8]

        System.out.println(ll2.get(2));//5  (2.indexteki elementi getirir)

        System.out.println(ll2.remove(1));//9 (1.indexteki elementi siler yani 9'u siler)
        System.out.println(ll2);//[4, 5, 8]

        //ama element olarak 8'i silmek icin=once bir variable'a 8'i atamamiz lazim.
        //sonra onu remove() methodu ile sileriz.
        Integer silinecekSayi= 8;
        System.out.println(ll2.remove(silinecekSayi));//true (yani bu elementi sildim)
        System.out.println(ll2);//[4, 5]






    }
}

package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_deque {

    public static void main(String[] args) {

        Deque <String> harfler=new LinkedList<>();//deque interface oldugu icin obje olusturulamaz
        harfler.add("g");
        harfler.add("K");
        harfler.add("A");
        System.out.println(harfler);//[g, K, A] sirayla ekleme yapti.

        System.out.println(harfler.add("e"));//true sona eklenir
        harfler.addLast("K");//sona eklenir
        harfler.addFirst("A");//en basa eklenir
        System.out.println(harfler);//[A, g, K, A, e, K]

        System.out.println(harfler.removeLastOccurrence("X")); // false

        // harfler.remove(); ilk elementi siler yani A yi siler.
        // harfler.remove("A"); A'nin ilk kullanimini siler
        // harfler.removeFirst(); ilk elementi siler
        // harfler.removeFirstOccurrence("A"); // A'nin ilk kullanimini siler.yani ilk buldugu A'yi siler
        //harfler.removeLastOccurrence("A"); A'nin son kullanimini siler.yani en son A'yi siler

        //System.out.println(harfler.poll()); // A (ilk elementi siler)
        System.out.println(harfler.pollFirst()); // A
        System.out.println(harfler); // [g, K, e, K]


        Deque<String> bosDeque = new LinkedList<>();
        // bosDeque.remove(); // NoSuchElementException
        // bosDeque.removeFirst(); // NoSuchElementException
        System.out.println(bosDeque.poll()); // null
        System.out.println(bosDeque.pollFirst()); // null


        // System.out.println(harfler.removeLast()); // K (enson elementi siler)
        // System.out.println(harfler.removeLastOccurrence("K")); // true (yani K'nin son kullanimini siler)
        System.out.println(harfler.pollLast()); // K (son elementi siler ve bize dondurur)

        System.out.println(harfler); // [g, K, e]


       // element() methodu Deque'in ilk elemanini silmeden bize getirir.bulamazsa exception firlatir
        System.out.println(harfler.element()); // g
        System.out.println(harfler); // [g, K, e]
        // System.out.println(bosDeque.element()); // NoSuchElementException

        //peek() methodu Deque'in ilk elemanini silmeden bize getirir.bulamazsa null dondurur.
        System.out.println(harfler.peek()); // g
        System.out.println(bosDeque.peek()); // null


        //pop() methodu ilk elemanini silip bize getirir.bulamazsa exception firlatir
        System.out.println(harfler.pop()); // g
        // removeFirst()=pop() ile aynidir
        System.out.println(harfler); // [K, e]


        //push() methodu basa element ekler.kapasiteye bakar. kapasite asilirsa IllegelStateException firlatir.
        harfler.push("A");
        // basa element ekler
        // addFirst()'den farkli olarak=
        // eger deque icin bir kapasite sinirlamasi varsa,
        // ve o sinir asilirsa IllegalStateException  verir.

        System.out.println(harfler); // [A, K, e]
        System.out.println(harfler.offer("R")); // true
        System.out.println(harfler); // [A, K, e, R]
        // add ile ayni islemi yapar
        // ama kapasite sinirlamasi olan durumlarda
        // kapasite asilirsa, eklemek yerine exception firlatir.


    }
}

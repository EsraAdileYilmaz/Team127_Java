package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {

    public static void main(String[] args) {

        // Arraylist'in yazim sekli:
        // burada dikkat etmem gereken sey primitive data turlerini
        // wrapper class'dan almam gerekiyor.
        List <Integer> sayilar=new ArrayList<>();

        //Yazdirma islemi sout icinde direk yapilir.
        System.out.println(sayilar);//[]

        //Eleman ekleme isi tek tek yapilir.( .add() ) methodu ile yapilir.
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);
        System.out.println(sayilar);//[5, 8, 3]

        sayilar.add(6);
        sayilar.add(9);
        System.out.println(sayilar);//[5, 8, 3, 6, 9]

        // Eleman ekleme isinde istenen bir indexe eleman eklemek icin ( .add(2,11))
        // yaparsak 2.indexe 11 'i ekle demis oluyoruz.
        // Var olan elementleri degistirmez,
        // istenen elementi, istenen index'e yerlestirir,
        // ve kalan elementleri geriye oteler.
        sayilar.add(2,11);
        System.out.println(sayilar);//[5, 8, 11, 3, 6, 9]


        List <Integer> rakamlar=new ArrayList<>();
        rakamlar.add(1);
        rakamlar.add(2);
        System.out.println(rakamlar);//[1, 2]

        //addAll() methodu ile bir list'i diger list'e komple ekleyebiliriz.
        //or:rakamlar.addAll(sayilar) yapinca:
        //sayilar listinin tamamini rakamlarin sonuna ekliyor.
        rakamlar.addAll(sayilar);
        System.out.println(rakamlar);//[1, 2, 5, 8, 11, 3, 6, 9]


        //addAll(1,sayilar) methodunu boyle kullanirsak bu su demek:
        //1.indexe sayilar list'ini ekle oluyor.
        rakamlar.addAll(1,sayilar);
        System.out.println(rakamlar);//[1, 5, 8, 11, 3, 6, 9, 2, 5, 8, 11, 3, 6, 9]






    }
}

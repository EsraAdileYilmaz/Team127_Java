package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {


        /*
        ArrayList'in uzunlugunu belirlemek icin: size() methodu kullanilir.
        ArrayList'in bos olup olmadigini belirlemek icin: isEmpty() methodu kullanilir.
        ArrayList'in icinde bir elemanin var olup olmadigini belirlemek icin :
                     contains() methodu kullanilir.
        ArrayList'in icinde bir diger ArrayList'in var olup olmadigini kontrol icin:
                     containsAll() methodu kullanilir.
         */

        List<Integer> sayilar=new ArrayList<>();

        System.out.println(sayilar);//[] bos bir list olustu.
        System.out.println(sayilar.size());// 0 verdi
        System.out.println("Liste bos mu : "+ sayilar.isEmpty());//Liste bos mu : true


        sayilar.add(5);
        sayilar.add(0,7);
        System.out.println(sayilar);//[7, 5]
        System.out.println(sayilar.size());//2
        System.out.println("Liste bos mu : "+ sayilar.isEmpty());//Liste bos mu : false


        System.out.println(sayilar.contains(5));//true (5 elemani list'in icinde var)
        System.out.println(sayilar.contains(3));//false (3 elemani list'in icinde yok)


        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar);//[7, 5, 3, 2, 8]

        List <Integer> rakamlar=new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);
        System.out.println(rakamlar);//[3, 8, 5]

        System.out.println(sayilar.containsAll(rakamlar));//true.  yani sayilar list'i rakamlar
                                                          //list'inin tamamini icerir demektir.

        rakamlar.add(9);
        System.out.println(rakamlar);//[3, 8, 5, 9]

        System.out.println(sayilar.containsAll(rakamlar));//false



    }
}

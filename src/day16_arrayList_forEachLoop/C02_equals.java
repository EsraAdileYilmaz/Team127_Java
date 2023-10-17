package day16_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_equals {
    public static void main(String[] args) {

        /*
        ArrayList'teki equals() methodu 2 list'i karsilastirir.
        Bunlarin hem degerleri ayni olmali ,hemde degerlerin siralamasi ayni olmalidir.
        Aksi takdirde false verir.

        ArrayList'te Collections.sort() methodu ile list'teki degerler natural order'a gore
        siralama yapilir.
         */

        List<Integer> sayilar1=new ArrayList<>();//[]

        List<Integer> sayilar2=new ArrayList<>();//[]

        System.out.println(sayilar1.equals(sayilar2));//true

        sayilar1.add(1);
        sayilar2.add(2);
        System.out.println(sayilar1.equals(sayilar2));//false

        sayilar1.add(0,2);//[2,1]
        sayilar2.add(1);//[2,1]
        System.out.println(sayilar1.equals(sayilar2));//true

        sayilar1.add(0,3);//[3, 2, 1]
        sayilar2.add(3);//[2, 1, 3]
        System.out.println(sayilar1.equals(sayilar2));//false
        //Sadece elemanlarin ayni degerleri barindirmasi yetmez siralamasida ayni olmali.

        Collections.sort(sayilar1); //[1, 2, 3]
        Collections.sort(sayilar2); //[1, 2, 3]
        System.out.println(sayilar1.equals(sayilar2));//true
    }
}

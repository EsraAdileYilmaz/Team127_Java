package day30_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2};

        List<Integer> sayilar=new ArrayList<>();
        for (Integer each:arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        //SORU1:index kullanmadan sadece cift elementleri yazdirin

        for (Integer each:sayilar
             ) {
            if(each %2 ==0){
                System.out.print(each+" ");//6 2 4 0 4 2 6 2
            }
        }

        System.out.println("");

        //SORU2:index kullanmadan listenin elementlerini 2 artirin

        for (Integer each:sayilar
             ) {
            each +=2;
        }
        System.out.println(sayilar);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]
        //bu yontemle elementler 2 artmadi.

        //SORU3:index kullanmadan cift sayilari silin
        Iterator iterator= sayilar.iterator();
        /*
        1)hasNext() methodu=yaninda element var mi? true/false
        2)next() methodu=siradaki element.(bir sonraki elemente geciyor)
        3)remove() methodu=element siliyor.
         */
        System.out.println(iterator.hasNext());//true(yani yanda element var mi? evet)

        System.out.println(iterator.next());//3 (1 element ileri gider.arkasinda kalan elementi yazdirir)
        System.out.println(iterator.hasNext());//true(yani yanda element var mi?true)
        iterator.next();//5 getirir.Yani ustunden gectigi elementi getirir
        System.out.println(iterator.next());//6 (artik getirilen bu cift sayiyi silmek istiyorsam)
        iterator.remove();//bunu yaptigimizda 6'yi sildik

        System.out.println(sayilar);//[3, 5, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]
        //burdan sonra kalan cift sayilari silmek icin ;
        //yaninda eleman oldugu muddetce tum cift sayilari sil=while(iterator.hasNext()){
        while(iterator.hasNext()){//yaninda eleman oldugu muddetce ilerle

            if((Integer)iterator.next() % 2==0){//next() methodu object dondurur.onu cast etmek lazim
                //getirdigin bir sonraki eleman cift sayi ise once cast et
                iterator.remove();//sonrada onu sil
            }
        }
        System.out.println(sayilar);//[3, 5, 9, 7, 1, 3, 5, 7]

        // iterator olusturduktan sonra sadece ileri gidebilir.
        // onceki olusturdugumuz iterator'a yaninda eleman oldukca ;[iterator.hasNext() == true]
        // ileriye git dedigimiz icin, loop'un sonunda iterator en sona ulasti.
        // Eger yeniden list'teki tum elementleri, bastan itibaren taramak istersek;
        // yeni bir iterator olusturmaliyiz yada olusturulmus objeye yeniden
        //deger atayarak yapabiliriz.

        //SORU4:ayni listede 5'ten buyuk olan sayilari silin
        iterator=sayilar.iterator();//var olan objeye tekrar atama yaptik.
        while(iterator.hasNext()){//yaninda eleman oldugu muddetce ilerle

            int sayi=(Integer)iterator.next();
            //next() methodu Object dondurdugu icin bizim bunu integer'a cast etmemiz lazim.

            if(sayi>5){
                iterator.remove();
            }
        }
        System.out.println(sayilar);//[3, 5, 1, 3, 5] suanda iterator sonda.
        //eger bir daha next() kullanirsak;
        //gidecegi eleman kalmadigindan exception firlatir.

       // iterator.next();//NoSuchElementException
        // zaten sondasin daha ilerde eleman yok demek.





    }
}

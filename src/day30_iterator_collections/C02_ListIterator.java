package day30_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2};

        List<Integer> sayilar=new ArrayList<>();
        for (Integer each:arr
        ) {
            sayilar.add(each);//[3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]
        }
        System.out.println(sayilar);

        //SORU1:Listedeki elemanlari sondan basa dogru yazdirin.

        ListIterator listIterator=sayilar.listIterator();

        //biz iterator olusturdugumuzda, listenin basina konumlanir.
        //Eger sondan basa dogru islem yapmak istiyorsak,
        //once iterator'i sona gondermeliyiz.

        while (listIterator.hasNext()){
            listIterator.next();
        }//bu loop ile iterator'u sona gonderdik.

        //Artik iterator sona gittigi icin,basa dogru istenen islemi yaparak gelebiliriz.

        while (listIterator.hasPrevious()){//oncesinde eleman oldugu muddetce git
            System.out.print(listIterator.previous()+" ");

        }//2 7 6 5 2 4 3 1 0 4 7 9 2 6 5 3 (boylece iterator basa geldi)
        System.out.println("");

        //SORU2:Tum elementleri 1 artirin.

        // iterator ile bir isleme baslamadan once,
        // iterator'un son olarak nerede oldugunu bilmeliyiz.
        // su an icin iterator basta oldugundan;bastan sona dogru ilerleyecegiz
        int sayi;

        while (listIterator.hasNext()){//yanda eleman oldugu muddetce ilerle
            sayi=(Integer)listIterator.next();//bir sonrakini integer olarak getir
            listIterator.set(sayi+1);//integer olarak getirdigini 1 artir
        }
        System.out.println(sayilar);//[4, 6, 7, 3, 10, 8, 5, 1, 2, 4, 5, 3, 6, 7, 8, 3]

       // SORU3:Tek sayilari silin.
        //Iterator suanda sonda.ozaman sondan basa dogru gidicez

        while (listIterator.hasPrevious()){

            sayi=(Integer)listIterator.previous();

            if(sayi %2 ==1){
                listIterator.remove();
            }
        }
        System.out.println(sayilar);//[4, 6, 10, 8, 2, 4, 6, 8]


        //SORU4: 5'den buyuk olanlari 1 azaltin, diger sayilari 1 artirin.

        //iterator basta. bastan sona gidicez
        System.out.println(listIterator.nextIndex());//0 (yani en basta)

        while (listIterator.hasNext()){

            sayi=(Integer)listIterator.next();
            if(sayi >5){
                listIterator.set(sayi-1);
            }else{
                listIterator.set(sayi+1);
            }
        }

        System.out.println(sayilar);//[5, 5, 9, 7, 3, 5, 5, 7]


        //SORU5: Tum sayilari iterator ile silin.

        //iterator suanda sonda
        System.out.println(listIterator.previousIndex());//7 (yani en son indexte)

        while (listIterator.hasPrevious()){
            listIterator.previous();//bir oncekine git yani sondan basa dogru ilerle
            listIterator.remove();//ve arkanda kalani sil
        }
        System.out.println(sayilar);//[]







    }
}

package day31_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraySorusuListIleCozum {

    public static void main(String[] args) {

        //SORU: Verilen array'den tekrar eden elementleri silip,
        //      array'i her bir elementin unique oldugu hali ile kaydedin.

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};


        // array'deki elementleri elden gecirelim,
        // olusturdugumuz list'de yoksa ekleyelim.
        List <Integer> tekrarsizList=new ArrayList<>();
        /*
         for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

         */
        for (Integer each:arr
             ) {
            if(! tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }//bu loop ile list'e unique elementleri ekledik
        System.out.println("List olarak tekrarsiz elementler: "+tekrarsizList);//[2, 4, 6, 1, 5, 7, 9, 8]

        // array'e list'in uzunlugunu tasiyan yeni bir deger atayalim
        arr=new int[tekrarsizList.size()];//[0,0,0,.....] bos bir array olustu

        // bir loop ile ArrayList'teki elementleri array'e kaydedelim
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= tekrarsizList.get(i);
        }

        System.out.println("List olarak tekrarsiz elementler: "+ tekrarsizList);
        //List olarak tekrarsiz elementler: [2, 4, 6, 1, 5, 7, 9, 8]
        System.out.println("Array'in son hali: "+ Arrays.toString(arr));
        //Array'in son hali: [2, 4, 6, 1, 5, 7, 9, 8]


    }
}

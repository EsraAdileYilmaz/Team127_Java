package day31_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraySorusuSetIleCozum {
    public static void main(String[] args) {

        // SORU:verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique oldugu hali ile kaydedin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};

        Set <Integer> tekrarsizSet=new TreeSet<>();//dogal sirali olacak

        // Set<> unique elementlerden olustugu icin,
        // array'deki elementleri set'e eklersek
        // tekrar edenler yok olur.

        for (Integer each:arr
             ) {
            tekrarsizSet.add(each);
        }//her bir unique elementi set'e ekledik.
        System.out.println("Set :"+tekrarsizSet);//Set :[1, 2, 4, 5, 6, 7, 8, 9]

        // Set index kullanmadigi icin fori-loop kullanamayiz.
        // for-each loop kullanmaliyiz.

        arr=new int[tekrarsizSet.size()];//array'e yeni deger atadik
        // for-each loop ile yapacagimiz icin array'in index'ini biz takip etmeliyiz.
        int index=0;
        for (Integer each:tekrarsizSet
             ) {
            arr[index]=each;
            index++;//0.indexten baslayip tum indexleri tek tek atamasi icin indexi takip ediyoruz.
        }
        System.out.println("Array'in son hali: "+ Arrays.toString(arr));
        //Array'in son hali: [1, 2, 4, 5, 6, 7, 8, 9]
    }
}

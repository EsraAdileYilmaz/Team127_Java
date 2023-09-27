package day13_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr= new int[5];
         /*
            Bir array olusturulurken, 2 sey mutlaka deklare edilmelidir;
            1- icine konulacak elementlerin data turu
            2- array'in icine konulacak element sayisi (length)

            Eger array'i yukardaki gibi olusturursak
            biz hic bir deger atamasi yapmadigimiz icin
            Java default olarak belirledigi degerleri atayacaktir.

            Array olusturulduktan sonra,
            olmayan index kullanilarak yeni deger atanmasi veya eklenmesi MUMKUN DEGILDIR.

            Yani 4 elemanli bir array'e 5.elementi ATAYAMAZSINIZ.Atamak isterseniz RTE verir.
            Ayni sekilde, 4 elemani olan bir array'den
            bir elemani silip, eleman sayisini 3'e dusuremezsiniz.
         */

        int [] arr2={4,1,7,5};

        System.out.println(arr2[1]); //1
        System.out.println(arr2[3]); //5
        System.out.println(arr2[arr2.length-1]);// 5 Yani son elementini yazdirir.

        //ilk array'de deger atamasi yapmadik.

        System.out.println(arr[0]); //0
        System.out.println(arr[arr.length-1]); //0 Yani son elementini yazdirir.

        // Olmayan index'deki bir elemente ulasmak istersek
        // System.out.println(arr2[5]); // ArrayIndexOutOfBoundsException

        //Olmayan bir index'e atama yapabilir miyiz ?
        // arr2[4]=8; //ArrayIndexOutOfBoundsException yani istenen index disi

        arr = new int [10]; // yepyeni bir array olusturur.
        arr = new int [20]; // yepyeni bir array olusturur.




    }
}

package day14_arrays;

import java.util.Arrays;

public class C04_ArraysSort {

    public static void main(String[] args) {

        //Arrays.sort() methodu ile array'leri naturel order'a gore duzenleriz.yani
        //sayilari kucukten buyuge, kelimeleri ise dictionnaire'e gore duzenleriz.

        int[] arr1 = {3,9,1,0,12,87,4,6};

        System.out.println(Arrays.toString(arr1));//[3, 9, 1, 0, 12, 87, 4, 6]

        //sort() methodu ile siralama yapalim
        Arrays.sort(arr1); //Atama yapilmasa da yapilan siralama kalici olur.
        System.out.println(Arrays.toString(arr1));//[0, 1, 3, 4, 6, 9, 12, 87]

        String[] arr2 = {"Ibrahim","Huseyin","Hasan","Ismail","Ishak","israfil","isa"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //[Hasan, Huseyin, Ibrahim, Ishak, Ismail, isa, israfil]

        /*
        ASCII degerleri sebebiyle kucuk harfler siralamada
         buyuk harflerden sonra gelir.
         */

        // String'lerde: method() calisinca yapilan degisiklikler kalici olmaz
        // degisikligin kalici olmasi icin atama yapmaliyiz.
        // Bu durum String'den kaynaklanan ozel bir durumdur(immutable class)
        String isim = "Ali";
        isim.toUpperCase(); // kalici bir degisiklik olmadi.cunku atama yapilmadi.
        System.out.println(isim); // Ali

    }
}

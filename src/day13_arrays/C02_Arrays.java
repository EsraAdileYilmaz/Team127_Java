package day13_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayi=10;

        int [] arr={4,6,1,2};

        //Bu array'i yazdiralim.
        System.out.println(sayi);// 10
        System.out.println(arr); //[I@1b0375b3 referans'ini verir

        /*
        Array'ler direk yazdirilamaz.
        Direk yazdirmak istersek , array'i deil referansini yazdirir.
        Array'i yazdirmak icin Arrays class'indan yardim almaliyiz.
        Arrays.toString() methodunu kullaniriz.
         */

        System.out.println(Arrays.toString(arr)); //[4, 6, 1, 2]

        String [] kelimeler={"Ali",", okula"," gitti."};
        System.out.println(Arrays.toString(kelimeler)); //[Ali, , okula,  gitti.]

        /*
        Arrays'lerin tamamini toString() methodu ile yazdirirsak;
        [] koseli parantezler icinde ve herbir elementin arasinda , (bosluk)
        olur.
         */

        //Array'in tum elementlerini yazdirin
        System.out.println(arr[0]);//4
        System.out.println(arr[1]);//6
        System.out.println(arr[2]);//1
        System.out.println(arr[3]);//2

        System.out.println("===========================");

        //Kisa yolla tum elementleri yazdirmak icin:
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        } //4 6 1 2 yazdirir.

        /*
        Biz ne zaman array'in tum elementleri ile ilgili bir islem yapmak istesek
            bir for loop olusturup;
                 arr[i]
            uzerinden istenen islemleri yapabiliriz.
         */
    }
}

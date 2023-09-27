package day14_arrays;

import day13_arrays.C06_Arrays_ElemanSayisiYazdir;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        //Arrays.binarySearch() methodu aranan bir elementin int olarak bize
        //indexini dondurur.
        //AMA oncesinde MUTLAKA Arrays.sort() yapilmalidir.

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        //arr'de 5'in olup olmadigini ve varsa kac tane oldugunu yazdirin
        C06_Arrays_ElemanSayisiYazdir.elemanSayisiYazdir(arr,5); //Aranan sayi array icinde bulunmamaktadir.

        //arr'de 3'un olup olmadigini ve varsa kac tane oldugunu yazdirin.
        C06_Arrays_ElemanSayisiYazdir.elemanSayisiYazdir(arr,3);//Aranan sayi array icinde 2 kez kullanilmistir.

        System.out.println("==========================================");
        System.out.println(Arrays.binarySearch(arr,8));//-11
        System.out.println(Arrays.binarySearch(arr,9));//-11
        System.out.println(Arrays.binarySearch(arr,2));//4
        System.out.println(Arrays.binarySearch(arr,1));//-1

        //Arrays.binarySearch() kullanmadan once Arrays.sort() kullanmazsaniz,
        //  sonucun ne olacagini BILEMEYIZ,
        //   dogru da olabilir, yanlis da olabilir.

        String[] isimler = {"Esra","Ibrahim","Huseyin","Omer","Azim","Azim"};

        //isimler'de Esra'nin olup olmadigini bulunuz.
        Arrays.sort(isimler);//isimleri siraladik
        System.out.println(Arrays.toString(isimler));//[Azim, Azim, Esra, Huseyin, Ibrahim, Omer]

        //Array'de arama yapmadan once sort() yapilmalidir.
        //Aradigimiz element varsa, ilk kullanimin index'ini dondurur.
        //yani ilk buldugu indexi dondurur.
        System.out.println(Arrays.binarySearch(isimler,"Esra"));//2
        System.out.println(Arrays.binarySearch(isimler,"Azim"));//0
        System.out.println(Arrays.binarySearch(isimler,"Omer"));//5

        //Aradigimiz element yoksa, olsaydi hangi sirada olacagini - isareti ile birlikte dondurur.

        System.out.println(Arrays.binarySearch(isimler,"Ahmed"));//-1 (olsaydi -1 olurdu)
        System.out.println(Arrays.binarySearch(isimler,"Deniz"));//-3 (olsaydi -3 olurdu)


    }
}

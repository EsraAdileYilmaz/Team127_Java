package day19_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {

    public static void main(String[] args) {


        int [] arr= {1,2,3};
        System.out.println("arr'nin ilk hali: "+ Arrays.toString(arr));//arr'nin ilk hali: [1, 2, 3]


        elemanlari2Artir(arr);//eleman artir method'unda degistirilen arr: [3, 4, 5]
        System.out.println("elemanlari artir method call'dan sonra arr : "+ Arrays.toString(arr));
        //elemanlari artir method call'dan sonra arr : [3, 4, 5]
        //Java array'i kontrol eder;array degismemisse eleman degisikligini kabul eder
        //ve eleman degisikligi kalici olur.


        arrayiDegistir(arr);//Array'i degistir methodunda olusan arr: [94, 71, 87]
        System.out.println("array'i degistir method call'dan sonra arr : "+Arrays.toString(arr));
        //array'i degistir method call'dan sonra arr : [3, 4, 5]
        //Java array'i kontrol eder;array'in kendisi degistirilip ,yeni array olusturulmus
        //ve bu yeni array uzerinden islem yapilmissa java yapilan degisikligi KALICI YAPMAZ.


    }

    public static void elemanlari2Artir(int [] arr){

        // array'in tum elementlerini 2 artirip
        // yeni halini yazdirsin

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=2;//her bir elemani 2 artir
        }
        System.out.println("eleman artir method'unda degistirilen arr: "+ Arrays.toString(arr));

        /*
        bu method icinde arr degismedi,
        sadece her bir elemanina 2 eklendi.
         */

    }

    public static void arrayiDegistir(int [] arr){

        // yeni 3 elemanli bir array olusturup,
        // icine rastgele 100'den kucuk sayilar koyun.
        // arr'ye bu yeni degeri atayin
        // ve arr'yi yazdirin

        int [] yeniArr= new int[3];
        Random random= new Random();//rastgele sayi bulma class'i

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]=random.nextInt(100);//rastgele 100'e kadar olan sinirda 3 sayi atayacak.
        }

        arr=yeniArr;

        System.out.println("Array'i degistir methodunda olusan arr: "+ Arrays.toString(arr));

        /*
        bu method icinde ise arr tamamen degisti,
        yeniArr uzerinden islem yapildi.
         */
    }
}
